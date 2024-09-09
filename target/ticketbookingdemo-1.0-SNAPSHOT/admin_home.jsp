
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">

    <head>
        <meta charset="UTF-8" />
        <title>Admin Dashboard</title>
        <link rel="stylesheet" href="assets/css/admin_style.css" />
        <!-- Boxicons CDN Link -->
        <link href="https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css" rel="stylesheet" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    </head>
    <body>
        <div class="sidebar">
            <div class="logo-details">
                <i class='bx bx-train'></i>
                <span class="logo_name">Railway</span>
            </div>
            <ul class="nav-links">
                <li>
                    <a href="#" class="active">
                        <i class="bx bx-grid-alt"></i>
                        <span class="links_name">All Tickets</span>
                    </a>
                </li>
                <li>
                    <a href='ATrain_list.jsp'>
                        <i class="bx bx-box"></i>
                        <span class="links_name">All Trains</span>
                    </a>
                </li>
                <li>
                    <a href="all_admins.jsp">
                        <i class="bx bx-list-ul"></i>
                        <span class="links_name">All Admins</span>
                    </a>
                </li>
                <li>
                    <a href="all_users.jsp">
                        <i class='bx bx-list-ul'></i>
                        <span class="links_name">All users </span>
                    </a>
                </li>

                <li class="log_out">
                    <a href="#">
                        <i class="bx bx-log-out"></i>
                        <span class="links_name">Log out</span>
                    </a>
                </li>
            </ul>
        </div>
        <section class="home-section">
            <nav>
                <div class="sidebar-button">
                    <i class="bx bx-menu sidebarBtn"></i>
                    <span class="dashboard">Dashboard</span>
                    <c:if test="${not empty welcome}">
                        <p>${welcome}</p>
                        <c:remove var="welcome" scope="session"/>
                    </c:if>
                </div>
                <div class="profile-details">
                    <span class="admin_name">Hey <%=session.getAttribute("admin")%></span>
                </div>
            </nav>
            <div class="home-content">
                <div class="overview-boxes">
                    <div class="box"><a href="Add_train.jsp">
                            <div class="right-side">
                                <div class="box-topic">Train</div>
                                <div class="number">Add</div>
                            </div>
                        </a>
                    </div>
                    <div class="box"><a href="#">
                            <div class="right-side">
                                <div class="box-topic">Update </div>
                                <div class="number">Train</div>
                                
                            </div>
                        </a>
                    </div>
                    <div class="box"><a href="#">
                            <div class="right-side">
                                <div class="box-topic">Remove</div>
                                <div class="number"> Train</div>
                            </div>
                        </a>
                    </div>
                    <div class="box"><a href="#">
                            <div class="right-side">
                                <div class="box-topic">Booked</div>
                                <div class="number">Tickets</div>
                            </div>
                        </a>
                    </div>
                    <div class="box"><a href="admin_register.jsp">
                            <div class="right-side">
                                <div class="box-topic">Add</div>
                                <div class="number">Admin</div>
                            </div>
                        </a>
                    </div>
                    <div class="box"><a href="#">
                            <div class="right-side">
                                <div class="box-topic">Remove</div>
                                <div class="number">Admin</div>
                            </div>
                        </a>
                    </div>




                </div>

            </div>
        </section>

        <script>
            let sidebar = document.querySelector(".sidebar");
            let sidebarBtn = document.querySelector(".sidebarBtn");
            sidebarBtn.onclick = function () {
                sidebar.classList.toggle("active");
                if (sidebar.classList.contains("active")) {
                    sidebarBtn.classList.replace("bx-menu", "bx-menu-alt-right");
                } else
                    sidebarBtn.classList.replace("bx-menu-alt-right", "bx-menu");
            };
        </script>
    </body>

</html>