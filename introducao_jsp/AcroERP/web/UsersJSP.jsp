<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
﻿<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <title>Bootstrap user profile template</title>
    <!-- BOOTSTRAP STYLE SHEET -->
    <link href="css/bootstrap.css" rel="stylesheet" />
    <!-- FONT-AWESOME STYLE SHEET FOR BEAUTIFUL ICONS -->
    <link href="css/font-awesome.css" rel="stylesheet" />
     <!-- CUSTOM STYLE CSS -->
    <style type="text/css">
               .btn-social {
            color: white;
            opacity: 0.8;
        }

            .btn-social:hover {
                color: white;
                opacity: 1;
                text-decoration: none;
            }

        .btn-facebook {
            background-color: #3b5998;
        }

        .btn-twitter {
            background-color: #00aced;
        }

        .btn-linkedin {
            background-color: #0e76a8;
        }

        .btn-google {
            background-color: #c32f10;
        }
    </style>
</head>
<body>
    <div class="navbar navbar-default navbar-static-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Design Bootstrap</a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav ">
                    <li><a href="#">HOME</a></li>
                    <li><a href="#">ABOUT</a></li>
                    <li><a href="#">SERVICES</a></li>
                    <li><a href="#">CONTACT</a></li>
                    <li><a href="UsersJSP.jsp">USERS</a></li>
                </ul>
            </div>

        </div>
    </div>
    <!-- NAVBAR CODE END -->


    <div class="container">
        <table class="table table-hover">
            <thead>
              <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">Email</th>
                <th scope="col">Telefone</th>
              </tr>
            </thead>
            <tbody>                
                <c:forEach var="userDb" items="${usersDb}" varStatus="loop">
                    <tr>
                        <th scope="row">${loop.index+1}</th>
                            <td>${userDb.name}</td>
                            <td>${userDb.email}</td>
                            <td>${userDb.phone}</td>
                    </tr>
                </c:forEach>
            </tbody>
          </table>
        <!-- SECTION END -->
    </div>
    <!-- CONATINER END -->

    <!-- REQUIRED SCRIPTS FILES -->
    <!-- CORE JQUERY FILE -->
    <script src="js/jquery-1.11.1.js"></script>
    <!-- REQUIRED BOOTSTRAP SCRIPTS -->
    <script src="js/bootstrap.js"></script>
</body>

</html>

