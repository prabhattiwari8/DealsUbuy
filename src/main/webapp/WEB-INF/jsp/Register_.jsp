<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register User</title>
</head>
<body ng-app="myApp">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.7/angular.js"></script>
<script src="<c:url value='/static/css/style.css' />"></script>
     <script src="<c:url value='/static/js/app.js' />"></script>
      <script src="<c:url value='/static/js/service/registerService.js' />"></script>
      <script src="<c:url value='/static/js/controller/registerController.js' />"></script>
       <div class="generic-container" ng-controller="registerController as ctrl">
         <div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">List of Countries </span></div>
              <div class="tablecontainer">
                  <table class="table table-hover">
                      <thead>
                          <tr>
                              <th>ID.</th>
                              <th>CountryName</th>
                           </tr>
                      </thead>
                      <tbody>
                          <tr ng-repeat="u in ctrl.countries">
                              <td><span ng-bind="u.countryId"></span></td>
                              <td><span ng-bind="u.countryName"></span></td>
                         </tr>
                         
                      </tbody>
                  </table>
              </div>
               <div>
       <select ng-model="selctedStat">
        <option ng-repeat="u in ctrl.countries" ng-value=u.countryName  >{{u.countryName}}
        </option>
       </select>
   </div>
          </div>
      </div>
</body>
</html>