<%-- 
    Document   : EnkartaHome
    Created on : 10 Oct, 2016, 11:58:26 PM
    Author     : karishma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <style>
div.container {
    width: 100%;
    border: 1px solid gray;
}

header, footer {
    padding: 1em;
    color: white;
    background-color: black;
    clear: left;
    text-align: center;
}

nav {
    float: left;
max-width: 180px;
    margin: 0;
    padding: 1em;
}

nav ul {
    list-style-type: none;
    padding: 0;
}
			
nav ul a {
    text-decoration: none;
}

article {
    margin-left: 150px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111111;
}


.mySlides {display:none;}
</style>
<body>

</head>

<body>

<div class="container">

      <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <h1>Enkarta-Home</h1>
    </header>
    <body>
        <nav>
  <ul>
      <li><a href="SearchArticles.jsp"><h2>ARTICLES</h2></a></li>
      <li><a href="map.html"><h2>ATLAS</h2></a></li>
      <li><a href="takeQuiz"><h2>Take Quiz</h2></a></li>
       <li><a href="funkarta.jsp"><h2>Funkarta</h2></a></li>
        <li><a href="Feedback.jsp"><h2>Feedback</h2></a></li>
        <li><a href="ViewFeedback"><h2>View Feedback</h2></a></li>
         <li><a href="EndSession"><h2>Logout</h2></a></li>
      
  </ul>
</nav>
      
      <article>
  <h1>ALL ABOUT Enkarta</h1>
   <div class="w3-content w3-section" style="max-width:200px">
  <img class="mySlides" src="index.jpg" style="width:150%">
  <img class="mySlides" src="index1.jpg" style="width:200%">
  
      
 
</div>
</article>
<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>

<footer>Copyright Â© enKaRta.com</footer>
</div>

</body>
</html>