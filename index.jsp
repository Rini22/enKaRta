<%-- 
    Document   : index
    Created on : 9 Oct, 2016, 9:28:26 AM
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
    <div class="container">
        <header>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <h1>Enkarta Login</h1>
        
    </header>
    <body>
       
        <form action="VerifyUser" method=post>
            <pre>
            
                    Login   <input type="text" name="id" value="" required maxlength="20"/>
                    Password<input type=password name="pwd" value=""required maxlength="20"/>
                    <select name="category">
<option>Admin</option>
<option>User</option>
</select>
                                    <input type=submit value="submit"/>
                                    
            </pre>
        </form>
        <br>
        <a href="Registration.jsp"><h3>new user</h3> </a>
        <footer>Copyright Â© enKaRta.com</footer>
    </body>
</html>
