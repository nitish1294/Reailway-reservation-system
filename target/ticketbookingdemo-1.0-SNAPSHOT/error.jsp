<%@page isErrorPage="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

    <head>
        <meta charset="utf-8">
        <title>Something went wrong....</title>
        <style>

            /*======================
                404 page
            =======================*/


            .page_404{
                padding:40px 0;
                background:#fff;
                font-family: 'Arvo', serif;
            }

            .page_404  img{
                width:100%;
            }

            .four_zero_four_bg{

                background-image: url(assets/image/dribbble_1.gif);
                height: 400px;
                background-position: center;
            }
            .text-center{
                text-align: center;
            }

            .four_zero_four_bg h1{
                font-size:80px;
            }

            .four_zero_four_bg h3{
                font-size:80px;
            }

            .link_404{
                color: #fff!important;
                padding: 10px 20px;
                background: #39ac31;
                margin: 20px 0;
                display: inline-block;
            }
            .contant_box_404{
                margin-top:-50px;
            }
        </style>
    </head>
    <body>
        <section class="page_404">
            <div class="container">
                <div class="row">	
                    <div class="col-sm-12 ">
                        <div class="col-sm-10 col-sm-offset-1  text-center">
                            <div class="four_zero_four_bg">
                                <h1 class="text-center ">500</h1>


                            </div>

                            <div class="contant_box_404">
                                <h3 class="h2">
                                    "Internal Server Error"
                                </h3>

                                <p>“The 500-error status code indicates that the server encountered an unexpected condition that prevented
                    it from fulfilling the request.”</p>

                                <a href="" class="link_404">Go to Home</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>

</html>