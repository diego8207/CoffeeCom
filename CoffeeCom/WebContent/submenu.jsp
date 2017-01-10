<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- BEGIN DASHBOARD STATS *********************************************************************************************** -->
     <div class="row">
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                    <div class="dashboard-stat yellow">
                            <div class="visual">
                                    <i class="fa fa-users"></i>
                            </div>
                            <div class="details">
                                    <div class="number">
												6
                                    </div>
                                    <div class="desc">
                                             Gestion Caficultores
                                    </div>
                            </div>
                           
                            <s:a cssClass="more" action="gestionCaficultor.action">
                            Ver Mas <i class="m-icon-swapright m-icon-white"></i>
                            </s:a>
                            
                    </div>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                    <div class="dashboard-stat green">
                            <div class="visual">
                                    <i class="fa fa-leaf"></i>
                            </div>
                            <div class="details">
                                    <div class="number">
										56
                                    </div>
                                    <div class="desc">
                                             Consultar Pergamino
                                    </div>
                            </div>
                            <s:a cssClass="more" action="consultarPergamino.action">
                            Ver Mas <i class="m-icon-swapright m-icon-white"></i>
                            </s:a>
                    </div>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                    <div class="dashboard-stat red">
                            <div class="visual">
                                    <i class="fa fa-bar-chart-o"></i>
                            </div>
                            <div class="details">
                                    <div class="number">
										78
                                    </div>
                                    <div class="desc">
                                             Informes y Estadisticas
                                    </div>
                            </div>
                            <s:a cssClass="more" action="estadisticas.action">
                            Ver Mas <i class="m-icon-swapright m-icon-white"></i>
                            </s:a>
                    </div>
            </div>
    </div>
<!-- END DASHBOARD STATS -->
