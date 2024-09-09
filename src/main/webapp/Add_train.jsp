<%-- 
    Document   : Add_train
    Created on : Apr 14, 2024, 8:49:48 PM
    Author     : Nitish
--%>
<%@page errorPage="error.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta http-equiv="X-UA-Compatible" content="ie=edge" />

        <style>
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
            }

            body {

                display: flex;
                align-items: center;
                justify-content: center;
                padding: 20px;
                background: rgb(130, 106, 251);
            }

            .container {
                position: relative;
                max-width: 700px;
                width: 100%;
                background: #fff;
                padding: 25px;
                border-radius: 8px;
                box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            }

            .container header {
                font-size: 1.5rem;
                color: #333;
                font-weight: 500;
                text-align: center;
            }

            .container .form {
                margin-top: 30px;
            }

            .form .input-box {
                width: 100%;
                margin-top: 20px;
            }

            .input-box label {
                color: #333;
            }

            .form :where(.input-box input, .select-box) {
                position: relative;
                height: 50px;
                width: 100%;
                outline: none;
                font-size: 1rem;
                color: #707070;
                margin-top: 8px;
                border: 1px solid #ddd;
                border-radius: 6px;
                padding: 0 15px;
            }

            .input-box input:focus {
                box-shadow: 0 1px 0 rgba(0, 0, 0, 0.1);
            }

            .form .column {
                display: flex;
                column-gap: 15px;
            }


            .form .btn {
                height: 55px;
                width: 100%;
                color: #fff;
                font-size: 1rem;
                font-weight: 400;
                margin-top: 30px;
                border: none;
                cursor: pointer;
                transition: all 0.2s ease;
                background: rgb(130, 106, 251);
            }

            .form .btn:hover {
                background: rgb(88, 56, 250);
            }

            /*Responsive*/
            @media screen and (max-width: 500px) {
                .form .column {
                    flex-wrap: wrap;
                }

            }
        </style>
    </head>
 

    <body>
        <section class="container">
            <header>ADD Trains</header>
            <form action="addtrain" class="form" method="post">
                <div class="column">
                    <div class="input-box">
                        <label>Train-Code </label>
                        <input type="text" placeholder="Enter Train Code" name="tcode" required />
                    </div>

                    <div class="input-box">
                        <label>Train-Name</label>
                        <input type="text" placeholder="Enter Train_Name" name="tname" required />
                    </div>
                </div>
                <div class="column">
                    <div class="input-box">
                        <label>Distance</label>
                        <input type="text" placeholder="Enter Distance" name="tdistance" required />
                    </div>

                    <div class="input-box">
                        <label>Train-Date</label>
                        <input type="date" name="tdate" required />
                    </div>
                </div>
                <div class="column">
                    <div class="input-box">
                        <label>Train-Arrival</label>
                        <input type="text" placeholder="Enter Train-Arrival" name="tfrom" required />
                    </div>

                    <div class="input-box">
                        <label>Train-Destination</label>
                        <input type="text" placeholder="Enter Train-Destination" name="tto" required />
                    </div>
                    <input type="hidden" name="bookedby" value="<%=session.getAttribute("admin")%>"/>  
                </div>
                <div class="column">
                    <div class="input-box">
                        <label>Arrival-Time</label>
                        <input type="time" name="atime" required />
                    </div>
                     <div class="input-box">
                        <label>Fire&#8377</label>
                        <input type="text" placeholder="Fire" name="fire" required />
                    </div>
                </div>

                <input type="submit" value="Submit" class="btn" />
            </form>
        </section>
    </body>

</html>