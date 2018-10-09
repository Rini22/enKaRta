<%-- 
    Document   : Feedback
    Created on : 14 Oct, 2016, 10:06:13 AM
    Author     : karishma
--%>
<%

        if(null == session.getAttribute("id")){  
  // User is not logged in.
                response.sendRedirect("index.jsp");
}       

  %>
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
    max-width: 160px;
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
    margin-left: 170px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}
</style>
</head>
<body>
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
    text-decoration: none;
}

article {
    margin-left: 170px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}
</style>
</head>
<div class="container">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <h1>Feedback</h1>
    </header>
    <body>
        <h2>Tell Us about Your Experience with us!</h2>
         
         <nav>
  <ul>
        <form action="Feedback" method="POST">
            <pre>
           
        <input type="text" name="fb" placeholder="Your Feedback!" size=100 style ="height:200px;" length onfocus="true" onselect="true" required />
        <br>
        <input type="submit" value="Save" name="submit" />
        <pre>
                
        </form>
        </ul>
</nav>
<footer><a href="EnkartaHome.jsp"><h4>Home</h4></a>
 Copyright Â© enKaRta.com
</footer>
    </body>
</html>
