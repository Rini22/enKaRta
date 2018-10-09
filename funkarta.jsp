<!DOCTYPE html>
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
    max-width: 160px;
    margin: 0;
    padding: 1em;
}

nav ul {
    list-style-type: none;
    padding: 0;
}
			
nav ul a {
    text-decoration: underline;
    color: black;
    font-style: normal;
    font-stretch: expanded;
   
}
  


















article {
    margin-left: 170px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}
</style>
</head>
<body>

<div class="container">

<header>
   <h1>funKaRta</h1>
</header>

<nav>
  <ul>
     
      <li><a href="index0.jsp"><h2>AUDIO  <h2></a></li>
      <li><a href="videos.jsp"><h2>VIDEO</h2></a></li>
      <li><a href="image.jsp"><h2>IMAGES</h2></a></li>
  </ul>
</nav>

<article>
  
  <section>
  <img class="mySlides" src="kid0.jpg"
  style="width:30%">
  <img class="mySlides" src="kid1.jpg"
  style="width:50%">
  <img class="mySlides" src="kid2.jpg"
  style="width:50%">
  <img class="mySlides" src="kid4.jpg"
  style="width:50% ">
</section>
</article>
    
<script>
// Automatic Slideshow - change image every 3 seconds
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
    setTimeout(carousel, 2000);
}
</script>
    
 <footer>Copyright © enKaRta.com</footer>


</div>
</body>
</html>