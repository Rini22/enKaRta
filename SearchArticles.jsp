<%-- 
    Document   : SearchArticles
    Created on : 23 Oct, 2016, 12:23:31 AM
    Author     : karishma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SearchArticles</title>
    </head>
    
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
        <h1>Search Articles</h1>
    </header>
    <body>
        <pre>
       
        <h3>Select Search Mode</h3>
        <form action="SearchArticles" method="POST">
        Search By Alphabet<input type="radio" name="mode" value="alphabet" required/>
        Search By Category<input type="radio" name="mode" value="category" required/>
        Search By Keyword<input type="radio" name="mode" value="keyword" />
        
        Search Keyword/Alphabet/Category<input type="text" name="word" value="" required/>

        <input type="submit" value="Search" />
            
            
</form>
        </pre>
        <footer><a href="EnkartaHome.jsp"><h4>Home</h4></a>
    </body>
</html>
