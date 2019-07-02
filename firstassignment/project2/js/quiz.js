var lastData=[];
var lastLocation=[];
var lastInnerHTML=[];

/*Button swapping
	$.ready(function() {
		$.addEvent($.get('btn'), 'click', function() {
				console.log("button push");
					 if(this.value == "start") {
									 this.value = "submit";
								//add dynamic html for answers starting and timers
			} else {
				if(this.value == "submit") {
						this.value="Show Score";
				} else {
					console.log("else");
				}
				//this.value =( this.value == "pause" )? "submit" : "pause";
			}
		});
	});
	*/
	//Dragon Drop
		function allowDrop(event){
		event.preventDefault();
	}
	function drag(event){
		event.dataTransfer.setData("Text", event.target.id);
	}
	function drop(event){
		event.preventDefault();
		if (!event.target.hasChildNodes()){
		var data= event.dataTransfer.getData("Text");
		event.target.appendChild(document.getElementById(data));

		lastData.push(data);
		lastInnerHTML.push(data.innerHTML);
		
	}
	else { console.log(event.target.firstChild)}
	}
	var minutesLabel = document.getElementById("minutes");
	var secondsLabel = document.getElementById("seconds");
	var totalSeconds = 0;
	var timer=setInterval(setTime, 100000000000);
	function resetTime(){
		totalSeconds=0;
		 timer=setInterval(setTime, 1000);
	}
	function stopTime(){

		window.clearInterval(timer);
	}

	function setTime() {
		++totalSeconds;
		secondsLabel.innerHTML = pad(totalSeconds % 60);
		minutesLabel.innerHTML = pad(parseInt(totalSeconds / 60));
	}

	function pad(val) {
		var valString = val + "";
		if (valString.length < 2) {
			return "0" + valString;
		} else {
			return valString;
		}
	}

	function quizStart(){
		// read in json file
		fetch("json/quiz.json")
		.then ( function (response){
			return response.json();
		})
		.then( function (data){

			editArray(data);
		})
		.catch (function (error){
			debugger;
			console.log("Error did the Happen");
		});

		//make 2 arrays of questions and answers
		function editArray (data){
			//2 for loops for putting the data in the correct place
			shuffle(data);
			var questions=[];
			var answers=[];

			var quizLocation=[1,2,3,4,5];
			shuffle(quizLocation);
			for (var i=0;i<5 ;i++ ){
				questions[i]= data[i].question;
				var termString="term"+(quizLocation[i]);
				document.getElementById(termString).innerHTML=questions[i];
				document.getElementById(termString).setAttribute("qCheck" , "a"+(i+1));
				//shuffle question side. set questionside to class id's on the drop side
			}
			for (var i=0;i<5 ;i++ ){
				answers[i]= data[i].answer;
				var answerString="answer"+ (i+1);
				var dropString="drop"+(i+1);
				var j=i+1;
				document.getElementById(answerString).innerHTML=answers[i];
				document.getElementById(dropString).setAttribute("aCheck","a"+(j));
			}
			function shuffle(array){
				for (var i = array.length - 1; i > 0; i--) {

    			let j = Math.floor(Math.random() * (i + 1)); // random index from 0 to i
    				[array[i], array[j]] = [array[j], array[i]]; // swap elements
  			}
			}
		}
	}

	function undo(){
		//return last data to table

		lastData.pop;

	}
