<!DOCTYPE html>
<html>
<head>
<style>
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







<ul>
  <li><a href="homePage.jsp">Home</a></li>
  <li><a href="about.jsp">About</a></li>
  <li><a href="index.jsp">Login</a></li>
  <li><a href="Registration.jsp">Registration</a></li>
    <li><a href="EnkartaHome.jsp">Enkarta Menu</a></li>
  <li><a href="Feedback.jsp">Feedback</a></li>
 
 
</ul>
<div class="w3-content w3-section" style="max-width:500px"> 
 <img class="mySlides" src="group.jpg" style="width:200%">
  <img class="mySlides" src="group2.jpg" style="width:200%">
  <img class="mySlides" src="read.jpg" style="width:200%">
   <img class="mySlides" src="image.jpg" style="width:300%" style="height:200%">
  <img class="mySlides" src="home1.jpg" style="width:200%">    
      
 
</div>
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
    setTimeout(carousel, 2500); // Change image every 1.5 seconds
}
</script>

</head>
<body>
<footer><a href="homePage.jsp"><h4>Home</h4></a>
 Copyright © enKaRta.com
</footer>

</body>
</html>