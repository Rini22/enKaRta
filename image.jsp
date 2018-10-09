<!DOCTYPE html>
<html lang="en">
<head>
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">TOUR TO GALLARY</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Gallery</a></li>
        <li><a href="homePage.jsp">HOME</a></li>
        <li><a href="funkarta.jsp">funKaRta</a></li>
        
         <li><a href="map.html">ATLAS</a></li>
          <li><a href="Feedback.jsp">FEEDBACK</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="EnkartaHome.jsp"><span class="glyphicon glyphicon-log-in"></span> enKaRta Menu</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="jumbotron">
  <div class="container text-center">
      <h1>PICTURE GALLERY</h1>      
   
  </div>
</div>
  
<div class="container-fluid bg-3 text-center">    
 
  <div class="row">
    <div class="col-sm-3">
        
     <a target="_blank" href="bermuda.jpg">
      <img src="bermuda.jpg?text=IMAGE" class="img-thumbnail" style="width:100%" alt="bermuda">
      <b>BERMUDA TRIANGLE</b>
    </div>
    <div class="col-sm-3">
        
      <a target="_blank" href="lights.jpg">
      <img src="lights.jpg?text=IMAGE" class="img-thumbnail" style="width:100%" alt="Image">
      <b>NORTHEN LIGHTS</b>
    </div>
    <div class="col-sm-3">
     
     <a target="_blank" href="mountains.jpg">
      <img src="mountains.jpg?text=IMAGE" class="img-thumbnail" style="width:100%" alt="Image">
         <b> HIMALAYA</b>
    </div>
    <div class="col-sm-3">
       
     <a target="_blank" href="forest.jpg">
      <img src="forest.jpg?text=IMAGE" class="img-thumbnail" style="width:100%" alt="Image">
       <b>SAVANAH</b>
    </div>
  </div>
</div><br>

<div class="container-fluid bg-3 text-center">    
  <div class="row">
    <div class="col-sm-3">
        
      <a target="_blank" href="juno.jpg">
      <img src="juno.jpg?text=IMAGE" class="img-thumbnail" style="width:100%" alt="Image">
      <P> JUNO MISSION </P>
     </div>
    <div class="col-sm-3"> 
      <a target="_blank" href="FALLS.jpg">
      <img src="FALLS.jpg?text=IMAGE" class="img-thumbnail" style="width:100%" alt="Image">
      <p>NIGERIA FALLS</p>
    </div>
    <div class="col-sm-3"> 
    <a target="_blank" href="3-taj.jpg">
      <img src="3-taj.jpg?text=IMAGE" class="img-thumbnail" style="width:100%" alt="Image">
      <p>TAJ MAHAL </p>
    </div>
    <div class="col-sm-3">
      <a target="_blank" href="darjeeling.jpg">
      <img src="darjeeling.jpg?text=IMAGE" class="img-thumbnail" style="width:100%" alt="Image">
      <p>DARJEELING</p>
    </div>
  </div>
</div><br><br>
<div class="container-fluid bg-3 text-center">    
  <div class="row">
    <div class="col-sm-3">
        
      <a target="_blank" href="indgate.jpg">
      <img src="indgate.jpg?text=IMAGE" class="img-thumbnail" style="" alt="Image">
      <P> INDIA GATE</P>
     </div>
    <div class="col-sm-3"> 
      <a target="_blank" href="nicobar.jpg">
      <img src="nicobar.jpg?text=IMAGE" class="img-thumbnail" style="width:100%" alt="Image">
      <p>ANDAMAN AND NICOBAR</p>
    </div>
    <div class="col-sm-3"> 
    <a target="_blank" href="lotus.jpg">
      <img src="lotus.jpg?text=IMAGE" class="img-thumbnail" style="width:100%" alt="Image">
      <p>LOTUS TEMPLE</p>
    </div>
    <div class="col-sm-3">
      <a target="_blank" href="paris.jpg">
      <img src="paris.jpg?text=IMAGE" class="img-thumbnailIMAGES" style="width:100%" alt="Image">
      <p>PARIS  </p>
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
  <p>Copyright © enKaRta.com</p>
</footer>

</body>
</html>
