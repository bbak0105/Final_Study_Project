<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="container">
	<div class="block-header">

                                   
                     
    
                
      <div class="block-header">
                        <h2>급여 관리</h2>
                        
                        <ul class="actions">
                            <li>
                                <a href="">
                                    <i class="md md-trending-up"></i>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <i class="md md-done-all"></i>
                                </a>
                            </li>
                            <li class="dropdown">
                                <a href="" data-toggle="dropdown">
                                    <i class="md md-more-vert"></i>
                                </a>
                                
                                <ul class="dropdown-menu dropdown-menu-right">
                                    <li>
                                        <a href="">Refresh</a>
                                    </li>
                                    <li>
                                        <a href="">Manage Widgets</a>
                                    </li>
                                    <li>
                                        <a href="">Widgets Settings</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                    
                    <div class="card">
                        <div class="card-header">
                            <h2>급여계산/대장 </h2>
                        </div>
                        			<!-- 상세검색 -->
		<form action="delivery_search" method="GET">
							<div class="container" style="margin-left: 16%;">
								<div class="row">
									<div class="col-25" style="text-align: center;">
										<label for="orderNo" class="label-pre">신고귀속</label>
									</div>

									<div class="col-25">

										<div class="fg-line form-group">
											<input type="text" class="form-control input-sm" id="deliNo"
												name="deliNo" id="deliNo" placeholder="신고 귀속을 입력해주세요..">

										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-25" style="text-align: center;">
										<label for="tpName" class="label-pre">구분</label>
									</div>

									<div class="col-25">

										<div class="fg-line form-group">
											<input type="text" class="form-control input-sm" id="tpName"
												name="transport.tpName"
												placeholder="구분해주세요..">

										</div>
									</div>
								</div>
										<div class="row">
									<div class="col-25" style="text-align: center;">
										<label for="tpName" class="label-pre">대장 명칭</label>
									</div>

									<div class="col-25">

										<div class="fg-line form-group">
											<input type="text" class="form-control input-sm" id="tpName"
												name="transport.tpName"
												placeholder="대장명칭을 입력해주세요..">

										</div>
									</div>
								</div>
										<div class="row">
									<div class="col-25" style="text-align: center;">
										<label for="tpName" class="label-pre">급여 대장</label>
									</div>

									<div class="col-25">

										<div class="fg-line form-group">
											<input type="text" class="form-control input-sm" id="tpName"
												name="transport.tpName"
												placeholder="급여대장을 입력해주세요..">

										</div>
									</div>
								</div>
				
								

					
								
		
				

							</div>

							<button id="searchBtn" type="submit"
								class="btn btn-primary waves-effect waves-button waves-float"
								style="float: right; margin-left: 10px; margin-right: 32%">검색</button>
	</form>
							<!-- profile끝 -->
							<!-- </form> -->
							<button id="resetBtn"
								class="btn btn-primary waves-effect waves-button waves-float"
								style="float: right;">초기화</button>
						
							<br>
							<br>
							<br>
							<hr>
							<br>
							<!-- 상세검색 끝 -->
                        
                        <div class="table-responsive">
                            <table id="data-table-command" class="table table-striped table-vmiddle">
                                <thead>
                                    <tr>
                                   <th data-column-id="id" data-type="numeric">신고귀속</th>
                                        <th data-column-id="sender">구분</th>
                                        <th data-column-id="sender">대장명칭</th>
                                        <th data-column-id="2">지급일</th>
                                        <th data-column-id="2">지급연월</th>
                                        <th data-column-id="2">급여대장</th>
                                        
                                       
                              
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>10238</td>
                                        <td>eduardo@pingpong.com</td>
                                        <td>010-5720-7088</td>
                                        <td>강대범</td>
                                    </tr>
                                    <tr>
                                        <td>10243</td>
                                        <td>eduardo@pingpong.com</td>
                                        <td>19.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10248</td>
                                        <td>eduardo@pingpong.com</td>
                                        <td>24.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10253</td>
                                        <td>eduardo@pingpong.com</td>
                                        <td>29.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10234</td>
                                        <td>lila@google.com</td>
                                        <td>10.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10239</td>
                                        <td>lila@google.com</td>
                                        <td>15.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10244</td>
                                        <td>lila@google.com</td>
                                        <td>20.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10249</td>
                                        <td>lila@google.com</td>
                                        <td>25.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10237</td>
                                        <td>robert@bingo.com</td>
                                        <td>13.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10242</td>
                                        <td>robert@bingo.com</td>
                                        <td>18.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10247</td>
                                        <td>robert@bingo.com</td>
                                        <td>23.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10252</td>
                                        <td>robert@bingo.com</td>
                                        <td>28.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10236</td>
                                        <td>simon@yahoo.com</td>
                                        <td>12.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10241</td>
                                        <td>simon@yahoo.com</td>
                                        <td>17.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10246</td>
                                        <td>simon@yahoo.com</td>
                                        <td>22.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10251</td>
                                        <td>simon@yahoo.com</td>
                                        <td>27.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10235</td>
                                        <td>tim@microsoft.com</td>
                                        <td>11.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10240</td>
                                        <td>tim@microsoft.com</td>
                                        <td>16.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10245</td>
                                        <td>tim@microsoft.com</td>
                                        <td>21.10.2013</td>
                                    </tr>
                                    <tr>
                                        <td>10250</td>
                                        <td>tim@microsoft.com</td>
                                        <td>26.10.2013</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    </div>
</div>
                    
                    
           <script src="${pageContext.request.contextPath }/js/jquery-2.1.1.min.js"></script>
         <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
      
         <script src="${pageContext.request.contextPath }/vendors/nicescroll/jquery.nicescroll.min.js"></script>
         <script src="${pageContext.request.contextPath }/vendors/bootgrid/jquery.bootgrid.min.js"></script>
         <script src="${pageContext.request.contextPath }/vendors/waves/waves.min.js"></script>
         <script src="${pageContext.request.contextPath }/vendors/bootstrap-growl/bootstrap-growl.min.js"></script>
         <script src="${pageContext.request.contextPath }/vendors/sweet-alert/sweet-alert.min.js"></script>




<!-- Data Table -->
<script type="text/javascript">
            $(document).ready(function(){
               $("#data-table-command").bootgrid();

               
  
            });
        </script>

                    
	

	