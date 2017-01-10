<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	
	<div class="col-md-3">
		<div class="booking-app">
			<a>
				<i class="fa fa-coffee pull-left"></i>
				<span>Gestion <br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  Caficultores</span>
			</a>
			<img src="./images/colombia.jpg" class="img-responsive" alt="">
		</div>
	</div>
	
	<div class="col-md-9">
<!-- 		ENCABEZADOS DE LOS TAB -->
		<div class="tabbable tabbable-custom boxless">
			<ul class="nav nav-tabs">
				<li class="active">
					<a href="#tab_1" data-toggle="tab">Registrar</a>
				</li>
				<li>
					<a href="#tab_2" data-toggle="tab">Consultar</a>
				</li>
				<li>
					<a href="#tab_3" data-toggle="tab">Fincas</a>
				</li>
			</ul>
<!-- 		CONTENIDO DE LOS TAB	 -->
		<div class="tab-content">
			<div class="tab-pane active" id="tab_1">
				<div class="col-md-12 ">
<!-- 				INSERTAMOS UN PORLET -->
					<div class="portlet box blue ">
						<div class="portlet-title">
							<div class="caption"><i class="fa fa-reorder"></i>Datos Personales</div>
									<div class="tools">
										<a href="" class="collapse"></a>
										<a href="#portlet-config" data-toggle="modal" class="config"></a>
										<a href="" class="reload"></a>
										<a href="" class="remove"></a>
									</div>
						</div>
<!-- 						CONTENIDO DEL PORTLET -->
						<div class="portlet-body form">
							<form class="form-horizontal" role="form">
<!-- 							COMIENZO DEL PORLET BODY			 -->
								<div class="form-body">
									
									<div class="form-group">
										<label class="col-md-3 control-label">Tipo Documento</label>
										<div class="col-md-9">
											<div class="radio-list">
												<label class="radio-inline"><input type="radio" name="optionsRadios" id="optionsRadios25" value="option1" checked> Cedula de Ciudadania </label>
												<label class="radio-inline"><input type="radio" name="optionsRadios" id="optionsRadios26" value="option2" checked> Cedula de Extrangeria </label>
											</div>
										</div>
									</div>
																	
									<div class="form-group">
										<label class="col-md-3 control-label">Documento:   </label>   
										<div class="col-md-6">
											<input required  type="text"  id="documento" name="documento"   placeholder="Numero de Identificacion"  class="form-control"   value=""       Maxlength="030"    />						     
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-md-3 control-label">Primer&nbspNombre:   </label>   
										<div class="col-md-6">
											<input required  type="text"  id="nombre1" name="nombre1"   placeholder="primer nombre"  class="form-control"   value=""       Maxlength="030"    />						     
										</div>
									</div>
																					   
									<div class="form-group">
										<label class="col-md-3 control-label">Segundo&nbspNombre:   </label>    
										<div class="col-md-6">												  
											<input required  type="text"  id="nombre2  	" name="nombre2  	"   placeholder="segundo nombre  	"  class="form-control"   value=""       Maxlength="030"    />						     
										</div>
									</div>
																					  
									<div class="form-group">
										<label class="col-md-3 control-label">Primer&nbspApellido:   </label>                               	 	
										<div class="col-md-6">
											<input required  type="text"  id="apellido1  	" name="apellido  	"   placeholder="primer appelido	"  class="form-control"   value=""       Maxlength="030"    />						     
										</div>
									</div>
																					   
									<div class="form-group">
										<label class="col-md-3 control-label">Segundo&nbspApellido  </label>                               	 	
										<div class="col-md-6">
											<input required  type="text"  id="apellido2 	" name="apellido2 	"   placeholder=" segundo apellido	"  class="form-control"   value=""       Maxlength="030"    />						     
										</div>
									</div>
																				   																																					
									<hr>
																					
									<div class="form-group">
									<div class="row">
										<label class="col-md-3 control-label">Fecha Nacimiento  </label>                               	 	
										<div class="col-md-2">
											<input required  type="text"  id="ano 	" name="ano"   placeholder="año"  class="form-control"   value=""       Maxlength="10"    />						     
										</div>
										<div class="col-md-2">
											<select class="form-control">
												<option >Mes</option>
												<option >Enero</option>
												<option >Febrero</option>
												<option >Marzo</option>
												<option >Abril</option>
												<option >Mayo</option>
												<option >Junio</option>
												<option >Julio</option>
												<option >Agosto</option>
												<option >Septiembre</option>
												<option >Octubre</option>
												<option >Noviembre</option>
												<option >Diciembre</option>
											</select>					     
										</div>
										<div class="col-md-2">
											<input required  type="text"  id="ano 	" name="ano"   placeholder=" dia"  class="form-control"   value=""       Maxlength="10"    />						     
										</div>
									</div>
										
									</div>
																														
									<div class="form-group">
										<label class="col-md-3 control-label">Genero:</label>
										<div class="col-md-9">
											<div class="radio-list">
												<label class="radio-inline"><input type="radio" name="optionsRadios" id="optionsRadios25" value="option1" checked> Masculino </label>
												<label class="radio-inline"><input type="radio" name="optionsRadios" id="optionsRadios26" value="option2" checked> Femenino </label>
											</div>
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-md-3 control-label"> Estado Civil: </label>
										<div class="col-md-9">
											<div class="radio-list">
												<label><input type="radio" name="optionsRadios" id="optionsRadios22" value="option1" checked> Soltero </label>
												<label><input type="radio" name="optionsRadios" id="optionsRadios23" value="option2" checked> Casado </label>
												<label><input type="radio" name="optionsRadios" id="optionsRadios23" value="option2" checked> Union Libre </label>
											</div>
										</div>
									</div>
																					
									<div class="form-group">
									<label for="inputEmail12" class="col-md-3 control-label">Telefono Celular</label>
										<div class="col-md-6">
											<div class="input-icon">
												<i class="fa fa-mobile-phone"></i>
												<input type="email" class="form-control" id="inputEmail12" placeholder="Telefono Celular">
											</div>
										</div>
									</div>

									<div class="form-group">
									<label for="inputEmail12" class="col-md-3 control-label">Telefono Fijo</label>
										<div class="col-md-6">
											<div class="input-icon">
												<i class="fa fa-phone-square"></i>
												<input type="email" class="form-control" id="inputEmail12" placeholder="Telefono Fijo">
											</div>
										</div>
									</div>
											
									<div class="form-group">
									<label for="inputPassword1" class="col-md-3 control-label">Correo Electronico</label>
									<div class="col-md-6">
										<div class="input-icon">
											<i class="fa fa-envelope"></i>
											<input type="email" class="form-control" id="inputEmail12" placeholder="Email">
										</div>
										<div class="help-block">
											 email@ejemplo.com
										</div>
									</div>
								</div>
																		  
								<div class="form-group">
									<label class="col-md-3 control-label">Direccion&nbspde&nbspResidencia:  </label>   
									<div class="col-md-6">												  
										<input required  type="text"  id="dirRecid   	" name="dirRecid   	"   placeholder="Direccion de residencia"  class="form-control"   value=""       Maxlength="040"    />						     
									</div>
								</div> 
									
								<div class="form-group">
									<label for="inputEmail12" class="col-md-3 control-label">Password</label>
									<div class="col-md-6">
										<div class="input-icon">
											<i class="fa fa-unlock-alt"></i>
											<input type="email" class="form-control" id="inputEmail12" placeholder="password">
										</div>
									</div>
								</div>
							
								</div>	<!-- 	FINAL DEL PORLET BODY			 -->

								<div class="form-actions fluid">
									<div class="col-md-offset-3 col-md-9">
										<button type="submit" class="btn blue">Crear Caficultor ahora</button>
									</div>
								</div>
							
							</form>
							</div><!-- FINAL DEL PORLET FORM -->
						</div><!-- FINAL DEL PORLET COMPLETO -->
					</div><!-- FINAL DE LAS 12 COLUMNAS UTILIZADAS CON EL PORLET  -->
				</div><!-- FINAL DEL tab_1  -->
			
		<div class="tab-pane" id="tab_2">
			<div class="row">
				<div class="col-md-12 ">
					
					<div class="portlet box blue ">
						<div class="portlet-title">
							<div class="caption"><i class="fa fa-reorder"></i> Consultar</div>
								<div class="tools">
								<a href="" class="collapse"></a>
								<a href="#portlet-config" data-toggle="modal" class="config"></a>
								<a href="" class="reload"></a>
							</div>
						</div>
						<div class="portlet-body form">
							<form class="form-horizontal" role="form">
<!-- 							COMIENZO DEL PORLET BODY			 -->
								<div class="form-body">
									
									<div class="form-group">
										<label class="col-md-3 control-label">Tipo Documento</label>
										<div class="col-md-9">
											<div class="radio-list">
												<label class="radio-inline"><input type="radio" name="optionsRadios" id="optionsRadios25" value="option1" checked> Cedula de Ciudadania </label>
												<label class="radio-inline"><input type="radio" name="optionsRadios" id="optionsRadios26" value="option2" checked> Cedula de Extrangeria </label>
											</div>
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-md-3 control-label">Documento:   </label>   
										<div class="col-md-6">
											<input required  type="text"  id="documento" name="documento"   placeholder="Numero de Identificacion"  class="form-control"   value=""       Maxlength="030"    />
											<br><button type="button" class="btn blue">Consultar</button>						     
										</div>
									</div>
									
									
									<table class="table table-striped table-hover table-bordered" id="sample_editable_1">
                                        <thead>
	                                        <tr>
	                                                <th>Documento</th>
	                                                <th> Nombres / Apellidos</th>
	                                                <th> Telefono</th>
	                                                <th> Finca</th>
	                                                <th> Editar</th>
	                                        </tr>
                                        </thead>
                                        <tbody>
	                                        <tr>
	                                                <td>14396183</td>
	                                                <td>Wilson Diaz</td>
	                                                <td>3163508194</td>
													<td>
		                                                	<a class="btn default btn-xs red"  data-toggle="modal" href="#modal2"  data-id=""><i class="fa fa-eye"></i> Ver</a>
													</td>
													<td><a class="btn default btn-xs yellow"  data-toggle="modal" href="#modal3"  data-id=""><i class="fa fa-edit"></i> Editar</a></td>
	                                        </tr>
	                                        <tr>
	                                                <td>1110869621</td>
	                                                <td>Guillermo Leyton</td>
	                                                <td>3158392623</td>
													<td>
		                                                	<a class="btn default btn-xs red">
		                                                		<i class="fa fa-eye"></i> Ver
		                                                	</a>
													</td>
													<td><a class="btn default btn-xs yellow"  data-toggle="modal" href="#stack2"  data-id=""><i class="fa fa-edit"></i> Editar</a></td>
	                                        </tr>
                                        </tbody>
                                    </table>
								
								</div>
							</form>
						</div>	
					</div>
					
				</div>
			</div>
		</div><!-- FINAL DEL tab_2  -->
		
		<div class="tab-pane" id="tab_3">
			<div class="row">
				<div class="col-md-12 ">
					
					<div class="portlet box blue ">
						<div class="portlet-title">
							<div class="caption"><i class="fa fa-reorder"></i>Gestion  Fincas</div>
								<div class="tools">
								<a href="" class="collapse"></a>
								<a href="#portlet-config" data-toggle="modal" class="config"></a>
								<a href="" class="reload"></a>
							</div>
						</div>
						<div class="portlet-body form">
							<form class="form-horizontal" role="form">
<!-- 							COMIENZO DEL PORLET BODY			 -->
								<div class="form-body">
									<div class="form-group">
										<div class="col-md-6">
											<a class="btn blue"  data-toggle="modal" href="#modal2"  data-id=""><i class="fa fa-eye"></i> Nueva</a>						     
										</div>
									</div>
									<table class="table table-striped table-hover table-bordered" id="sample_editable_1">
                                        <thead>
	                                        <tr>
	                                                <th>Nombre</th>
	                                                <th>Hectareas</th>
	                                                <th>Municipio</th>
	                                                <th>Vereda</th>
	                                                <th>Longitud</th>
	                                                <th>Latitud</th>
	                                                <th>Lotes</th>
	                                                <th>Editar</th>
	                                        </tr>
                                        </thead>
                                        <tbody>
	                                        <tr>
	                                                <td>El Aceituno</td>
	                                                <td>1200</td>
	                                                <td>Ortega</td>
	                                                <td>Aceituno</td>
	                                                <td>-75.2424379</td>
	                                                <td>4.44467599</td>
													<td>
		                                                	<a class="btn default btn-xs red"  data-toggle="modal" href="#modal5"  data-id=""><i class="fa fa-eye"></i> Ver</a>
													</td>
													<td><a class="btn default btn-xs yellow"  data-toggle="modal" href="#modal4"  data-id=""><i class="fa fa-edit"></i> Editar</a></td>
	                                        </tr>
                                        </tbody>
                                    </table>
								</div>
							</form>
						</div>	
					</div>
					
				</div>
			</div>
		</div><!-- FINAL DEL tab_3  -->
	</div><!-- FINAL DEL CONTENIDO DE LOS TAB	 -->
</div><!-- FINAL DE LA ESTRUCTURA DE LOS TAB	 -->
</div> <!-- FINAL DE LAS 9 COLUMNAS RESERVADAS PARA EL TAB	 -->		
																				
</div> <!-- FINAL DEL ROW ESTABLECIDO PARA EL CONTENIDO DE TODO EL FORMULARIO DE REGISTRO DE CAFICULTORES	 -->


<!-- MODAL QUE PERMITE MOSTRAR LA FINCA DEL CAFICULTOR A CONSULTAR -->
<div id="modal2" class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
	<div class="modal-body">
				<div class="portlet box yellow">
					
					<div class="portlet-title">
						<div class="caption">
							<i class="fa fa-reorder"></i>Fincas
						</div>
					</div>
					
					<div class="portlet-body form">
<br>
					<div class="row">
						<div class="col-md-6">
							<!-- BEGIN BASIC PORTLET-->
							<div class="portlet solid blue">
								<div class="portlet-title">
									<div class="caption">
										<i class="fa fa-reorder"></i>Finca El Aceituno
									</div>
								</div>
								<div class="portlet-body">
									<img src="./images/fincaCafetera.png" class="img-responsive" alt="">
								</div>
							</div>
							<!-- END BASIC PORTLET-->
						</div>
						<div class="col-md-6">
							<!-- BEGIN MARKERS PORTLET-->
							<div class="portlet solid yellow">
								<div class="portlet-title">
									<div class="caption">
										<i class="fa fa-reorder"></i>Georeferenciación
									</div>
								</div>
								<div class="portlet-body">
									<img src="./images/aceituno2.png" class="img-responsive" alt="">
<!-- <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3983.606272877434!2d-75.64529578568666!3d3.1976786537452058!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8e3bb3ca8e249e3d%3A0xc056b59c80ec0d22!2sPlanadas+Coffee!5e0!3m2!1ses!2sco!4v1469103808730" width="390" height="292" frameborder="0" style="border:0" allowfullscreen></iframe> -->
								</div>
							</div>
							<!-- END MARKERS PORTLET-->
						</div>
					</div>
					<div class="portlet solid yellow">
							<div class="portlet-title">
								<div class="caption">
									<i class="fa fa-reorder"></i>Lotes
								</div>
							</div>
					</div>
					
					<table class="table table-striped table-hover table-bordered" id="sample_editable_1">
                                        <thead>
	                                        <tr>
	                                                <th>Código</th>
	                                                <th>Hectáreas</th>
	                                                <th>Arboles</th>
	                                                <th>Tipo Cafe</th>
	                                                <th>Fecha Cultivo</th>
	                                                <th>Fecha Disponible</th>
	                                                <th>Edad</th>
	                                        </tr>
                                        </thead>
                                        <tbody>
	                                        <tr>
	                                                <td>028</td>
	                                                <td>2</td>
	                                                <td>200</td>
													<td>Caturra</td>
													<td>01/06/2013</td>
													<td>01/08/2016</td>
													<td>3 años 3 meses</td>
	                                        </tr>
	                                        <tr>
	                                                <td>029</td>
	                                                <td>5</td>
	                                                <td>900</td>
													<td>Variedad</td>
													<td>01/09/2014</td>
													<td>01/08/2016</td>
													<td>1 año 9 meses</td>
	                                        </tr>
                                        </tbody>
                                    </table>
					
						<!-- BEGIN FORM-->
							<div class="modal-footer">
								<a class="btn default btn-xs yellow"  data-toggle="modal" href="#modal4"  data-id=""><i class="fa fa-edit"></i> Editar</a>
								<button type="button" data-dismiss="modal" class="btn default btn-xs green">Cancelar</button>
							</div>
<%-- 						</s:form> --%>
					<!-- END FORM-->
					</div> <!-- FINAL DEL PORLET BODY -->
				</div> <!-- FINAL DEL PORLET YELLOW -->
			</div> <!-- FINAL DEL MODAL BODY -->
    	</div> <!-- FINAL DEL MODAL CONTENT -->
  	</div> <!-- FINAL DEL MODAL LG -->
</div> <!-- FINAL DEL MODAL PADRE -->


<!-- -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -->

<div id="modal3" class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
	<div class="modal-body">
				<div class="portlet box yellow">
					
					<div class="portlet-title">
						<div class="caption">
							<i class="fa fa-reorder"></i>Editar Caficultor
						</div>
					</div>
					
					<!-- 						CONTENIDO DEL PORTLET -->
						<div class="portlet-body form">
							<form class="form-horizontal" role="form">
<!-- 							COMIENZO DEL PORLET BODY			 -->
								<div class="form-body">
									
									<div class="form-group">
										<label class="col-md-3 control-label">Tipo Documento</label>
										<div class="col-md-9">
											<div class="radio-list">
												<label class="radio-inline"><input type="radio" name="optionsRadios" id="optionsRadios25" value="option1" checked> Cedula de Ciudadania </label>
												<label class="radio-inline"><input type="radio" name="optionsRadios" id="optionsRadios26" value="option2" > Cedula de Extrangeria </label>
											</div>
										</div>
									</div>
																	
									<div class="form-group">
										<label class="col-md-3 control-label">Documento:   </label>   
										<div class="col-md-6">
											<input required  type="text"  id="documento" name="documento"   placeholder="Numero de Identificacion"  class="form-control"   value="14396183"       Maxlength="030"    />						     
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-md-3 control-label">Primer&nbspNombre:   </label>   
										<div class="col-md-6">
											<input required  type="text"  id="nombre1" name="nombre1"   placeholder="primer nombre"  class="form-control"   value="Wilson"       Maxlength="030"    />						     
										</div>
									</div>
																					   
									<div class="form-group">
										<label class="col-md-3 control-label">Segundo&nbspNombre:   </label>    
										<div class="col-md-6">												  
											<input required  type="text"  id="nombre2  	" name="nombre2  	"   placeholder="segundo nombre  	"  class="form-control"   value=""       Maxlength="030"    />						     
										</div>
									</div>
																					  
									<div class="form-group">
										<label class="col-md-3 control-label">Primer&nbspApellido:   </label>                               	 	
										<div class="col-md-6">
											<input required  type="text"  id="apellido1" name="apellido  	"   placeholder="primer appelido	"  class="form-control"   value="Diaz"       Maxlength="030"    />						     
										</div>
									</div>
																					   
									<div class="form-group">
										<label class="col-md-3 control-label">Segundo&nbspApellido  </label>                               	 	
										<div class="col-md-6">
											<input required  type="text"  id="apellido2" name="apellido2 	"   placeholder=" segundo apellido	"  class="form-control"   value=""       Maxlength="030"    />						     
										</div>
									</div>
																				   																																					
									<hr>
																					
									<div class="form-group">
									<div class="row">
										<label class="col-md-3 control-label">Fecha Nacimiento  </label>                               	 	
										<div class="col-md-2">
											<input required  type="text"  id="ano 	" name="ano"   placeholder="año"  class="form-control"   value="1982"       Maxlength="10"    />						     
										</div>
										<div class="col-md-2">
											<select class="form-control">
												<option >Julio</option>
												<option >Enero</option>
												<option >Febrero</option>
												<option >Marzo</option>
												<option >Abril</option>
												<option >Mayo</option>
												<option >Junio</option>
												<option >Julio</option>
												<option >Agosto</option>
												<option >Septiembre</option>
												<option >Octubre</option>
												<option >Noviembre</option>
												<option >Diciembre</option>
											</select>					     
										</div>
										<div class="col-md-2">
											<input required  type="text"  id="dia" name="dia"   placeholder=" dia"  class="form-control"   value="13"       Maxlength="10"    />						     
										</div>
									</div>
										
									</div>
																														
									<div class="form-group">
										<label class="col-md-3 control-label">Genero:</label>
										<div class="col-md-9">
											<div class="radio-list">
												<label class="radio-inline"><input type="radio" name="optionsRadios" id="optionsRadios25" value="option1" checked> Masculino </label>
												<label class="radio-inline"><input type="radio" name="optionsRadios" id="optionsRadios26" value="option2" > Femenino </label>
											</div>
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-md-3 control-label"> Estado Civil: </label>
										<div class="col-md-9">
											<div class="radio-list">
												<label><input type="radio" name="optionsRadios" id="optionsRadios" value="option_1" checked> Soltero </label>
												<label><input type="radio" name="optionsRadios" id="optionsRadios" value="option_2"> Casado </label>
												<label><input type="radio" name="optionsRadios" id="optionsRadios" value="option_3"> Union Libre </label>
											</div>
										</div>
									</div>
																					
									<div class="form-group">
									<label for="inputEmail12" class="col-md-3 control-label">Telefono Celular</label>
										<div class="col-md-6">
											<div class="input-icon">
												<i class="fa fa-mobile-phone"></i>
												<input type="email" class="form-control" id="celular" placeholder="Telefono Celular" value="3163508194">
											</div>
										</div>
									</div>

									<div class="form-group">
									<label for="inputEmail12" class="col-md-3 control-label">Telefono Fijo</label>
										<div class="col-md-6">
											<div class="input-icon">
												<i class="fa fa-phone-square"></i>
												<input type="email" class="form-control" id="fijo" placeholder="Telefono Fijo"  value="2685239">
											</div>
										</div>
									</div>
											
									<div class="form-group">
									<label for="inputPassword1" class="col-md-3 control-label">Correo Electronico</label>
									<div class="col-md-6">
										<div class="input-icon">
											<i class="fa fa-envelope"></i>
											<input type="email" class="form-control" id="email" placeholder="Email" value="davelezp@ut.edu.co">
										</div>
										<div class="help-block">
											 email@ejemplo.com
										</div>
									</div>
								</div>
																		  
								<div class="form-group">
									<label class="col-md-3 control-label">Direccion&nbspde&nbspResidencia:  </label>   
									<div class="col-md-6">												  
										<input required  type="text"  id="dirRecid   	" name="dirRecid"   placeholder="Direccion de residencia"  class="form-control"   value="Manzana a casa 3 Bunde et 2"       Maxlength="040"    />						     
									</div>
								</div> 
									
								<div class="form-group">
									<label for="inputEmail12" class="col-md-3 control-label">Password</label>
									<div class="col-md-6">
										<div class="input-icon">
											<i class="fa fa-unlock-alt"></i>
											<input type="email" class="form-control" id="password" placeholder="password" value="d13g0$v3l3z">
										</div>
									</div>
								</div>
							
								</div>	<!-- 	FINAL DEL PORLET BODY			 -->

								<div class="form-actions fluid">
									<div class="col-md-offset-3 col-md-9">
										<button type="submit" class="btn blue">Actualizar</button>
										<button type="button" data-dismiss="modal" class="btn green">Cancelar</button>
									</div>
								</div>
							
							</form>
							</div><!-- FINAL DEL PORLET FORM -->

    	</div> <!-- FINAL DEL MODAL CONTENT -->
  	</div> <!-- FINAL DEL MODAL LG -->
</div> <!-- FINAL DEL MODAL PADRE -->
</div>
</div>
<!-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -->

<div id="modal4" class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
	<div class="modal-body">
																		<div class="portlet box blue ">
															<div class="portlet-title">
																<div class="caption">
																	<i class="fa fa-reorder"></i> Editar Finca
																</div>
																<div class="tools">
																	<a href="" class="collapse">
																	</a>
																	<a href="#portlet-config" data-toggle="modal" class="config">
																	</a>
																</div>
															</div>
															<div class="portlet-body form">
																<form class="form-horizontal" role="form">
																	<div class="form-body">
																		  
																		    <div class="form-group">
																				<label class="col-md-3 control-label">Nombre de la Finca:</label>
																				<div class="col-md-3">
																					<input required  type="text"  id="_nombre" name="_nombre"   placeholder="_nombre"  class="form-control"   value="El Aceituno"       Maxlength="030"    />
																				</div>
																		    </div>
																		  
																		  
																		    <div class="form-group">
																							<label class="col-md-3 control-label">Municipio.</label>
																							<div class="col-md-6">
																								<select class="form-control" name="_municipio"   >
																									<option >Ortega </option>
																									<option >Venadillo </option>
																									<option >Ibague </option>
																								</select>
																							</div>
																			</div>
																		  
																		    <div class="form-group">
																							<label class="col-md-3 control-label">Distrito.</label>
																							<div class="col-md-6">
																								<select class="form-control" name="_distrito   	" value="Tolima"  >
																									<option >Tolima </option>
																									<option >Otro </option>
																								</select>
																							</div>
																			</div>
																		
																		  
																		   <div class="form-group">
																				<label class="col-md-3 control-label">Vereda:</label>
																				<div class="col-md-5">
																					<input required  type="text"  id="vereda" name="vereda"   placeholder="vereda"  class="form-control"   value="Aceituno"       Maxlength="030"    />
																				</div>
																		  </div>
																		  
																		   <div class="form-group">
																				<label class="col-md-3 control-label">Latitud:</label>
																				<div class="col-md-4">
																					<input required  type="text"  id="latitud 	" name="latitud 	"   placeholder="latitud 	"  class="form-control"   value="4.44467599"       Maxlength="030"    />
																				</div>
																		  </div>
																		  
																		   <div class="form-group">
																				<label class="col-md-3 control-label">Longitud:</label>
																				<div class="col-md-4">
																					<input required  type="text"  id="longitud	" name="longitud	"   placeholder="longitud	"  class="form-control"   value="-75.2424379"       Maxlength="030"    />
																				</div>
																		  </div>
																		  
																		   
																		  
																	</div>
																	
																	<div class="form-actions fluid">
																		<div class="col-md-offset-3 col-md-9">
																			<button type="submit" class="btn yellow">Actualizar</button>
																			<button type="button" data-dismiss="modal" class="btn green">Cancelar</button>
																		</div>
																	</div>
																</form>
															
															</div>
													
														</div>
	

    	</div> <!-- FINAL DEL MODAL CONTENT -->
  	</div> <!-- FINAL DEL MODAL LG -->
</div> <!-- FINAL DEL MODAL PADRE -->
</div>

<!-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -->

<div id="modal5" class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
	<div class="modal-body">
																		<div class="portlet box blue ">
															<div class="portlet-title">
																<div class="caption">
																	<i class="fa fa-reorder"></i> Ver Lotes
																</div>
																<div class="tools">
																	<a href="" class="collapse">
																	</a>
																	<a href="#portlet-config" data-toggle="modal" class="config">
																	</a>
																	<a href="" class="reload">
																	</a>
																</div>
															</div>
															<div class="portlet-body form">
																<form class="form-horizontal" role="form">
																	<div class="form-body">
																						  
																	<table class="table table-striped table-hover table-bordered" id="sample_editable_1">
                                        <thead>
	                                        <tr>
	                                                <th>Código</th>
	                                                <th>Hectáreas</th>
	                                                <th>Arboles</th>
	                                                <th>Tipo Cafe</th>
	                                                <th>Fecha Cultivo</th>
	                                                <th>Fecha Disponible</th>
	                                                <th>Edad</th>
	                                        </tr>
                                        </thead>
                                        <tbody>
	                                        <tr>
	                                                <td>028</td>
	                                                <td>2</td>
	                                                <td>200</td>
													<td>Caturra</td>
													<td>01/06/2013</td>
													<td>01/08/2016</td>
													<td>3 años 3 meses</td>
	                                        </tr>
	                                        <tr>
	                                                <td>029</td>
	                                                <td>5</td>
	                                                <td>900</td>
													<td>Variedad</td>
													<td>01/09/2014</td>
													<td>01/08/2016</td>
													<td>1 año 9 meses</td>
	                                        </tr>
                                        </tbody>
                                    </table>	   
																		  
																	</div>
																	
																	<div class="form-actions fluid">
																		<div class="col-md-offset-3 col-md-9">
																			<button type="submit" class="btn yellow">Actualizar</button>
																			<button type="button" data-dismiss="modal" class="btn green">Cancelar</button>
																		</div>
																	</div>
																</form>
															
															</div>
													
														</div>
	

    	</div> <!-- FINAL DEL MODAL CONTENT -->
  	</div> <!-- FINAL DEL MODAL LG -->
</div> <!-- FINAL DEL MODAL PADRE -->
</div>




