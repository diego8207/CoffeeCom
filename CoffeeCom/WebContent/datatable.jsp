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
										<button type="submit" class="btn blue">Grabar</button>
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
	                                                <th> GPS</th>
	                                                <th> Editar</th>
	                                        </tr>
                                        </thead>
                                        <tbody>
	                                        <tr>
	                                                <td>14396183</td>
	                                                <td>Diego Velez</td>
	                                                <td>3163508194</td>
	                                                <td>
	                                                	<a class="btn default btn-xs green">
		                                                		<i class="fa fa-eye"></i> Ver
		                                                </a>
	                                                </td>
													<td>
		                                                	<a class="btn default btn-xs red">
		                                                		<i class="fa fa-eye"></i> Ver
		                                                	</a>
													</td>
													<td><a class="btn default btn-xs yellow"  data-toggle="modal" href="#stack2"  data-id="">Editar</a></td>
	                                        </tr>
	                                        <tr>
	                                                <td>1110869621</td>
	                                                <td>Carolina Vargas</td>
	                                                <td>3158392623</td>
	                                                <td>
	                                                	<a class="btn default btn-xs green">
		                                                		<i class="fa fa-eye"></i> Ver
		                                                </a>
	                                                </td>
													<td>
		                                                	<a class="btn default btn-xs red">
		                                                		<i class="fa fa-eye"></i> Ver
		                                                	</a>
													</td>
													<td><a class="btn default btn-xs yellow"  data-toggle="modal" href="#stack2"  data-id="">Editar</a></td>
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
	</div><!-- FINAL DEL CONTENIDO DE LOS TAB	 -->
</div><!-- FINAL DE LA ESTRUCTURA DE LOS TAB	 -->
</div> <!-- FINAL DE LAS 9 COLUMNAS RESERVADAS PARA EL TAB	 -->		
																				
</div> <!-- FINAL DEL ROW ESTABLECIDO PARA EL CONTENIDO DE TODO EL FORMULARIO DE REGISTRO DE CAFICULTORES	 -->
									
	