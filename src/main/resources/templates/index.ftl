<!DOCTYPE html>

<html lang="en" ng-app="crudApp">
	<head>
		<title>${title}</title>
		<link href="css/bootstrap.css" rel="stylesheet" />
		<link href="css/app.css" rel="stylesheet"/>	
	</head>
	<body>
		<div ui-view></div>
		<script src="js/lib/angular.min.js"></script>
		<script src="js/lib/angular-ui-router.min.js"></script>
		<script src="js/lib/localforage.min.js"></script>
		<script src="js/lib/ngStorage.min.js"></script>
		<script src="js/lib/app/app.min.js"></script>
		<script src="js/lib/app/UserService.min.js"></script>
		<script src="js/lib/app/UserController.min.js"></script>
	</body>
</html>												