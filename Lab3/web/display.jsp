<%-- 
    Document   : display
    Created on : Feb 20, 2018, 1:15:09 PM
    Author     : toshiba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <script src="myJS.js"></script>
    </head>
     <style>
    #msgs {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    #msgs td, #msgs th {
        border: 1px solid #ddd;
        padding: 8px;
    }

    #msgs tr:nth-child(even){background-color: #f2f2f2;}

    #msgs tr:hover {background-color: #ddd;}

    #msgs th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: #4CAF50;
        color: white;
    }
    
    #users {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    #users td, #users th {
        border: 1px solid #ddd;
        padding: 8px;
    }

    #users tr:nth-child(even){background-color: #f2f2f2;}

    #users tr:hover {background-color: #ddd;}

    #users th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: #4CAF50;
        color: white;
    }
    .button {
        background-color: #4CAF50;
        border: none;
        color: white;
        padding: 15px 32px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        margin: 4px 2px;
        cursor: pointer;
    }
    .textField{
        
    }
    </style>
    <body>
        Name <input class="textField" type="text" id="name">
        Message<input class="textField" type="text" id="msg">
        <input type="button" id="send" value="button" class="button" >
        <div id="msgs"></div>
        <div id="users"></div>
    </body>
</html>
