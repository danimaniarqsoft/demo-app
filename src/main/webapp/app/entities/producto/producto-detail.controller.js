(function() {
    'use strict';

    angular
        .module('kukulkanmongoApp')
        .controller('ProductoDetailController', ProductoDetailController);

    ProductoDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'DataUtils', 'entity', 'Producto'];

    function ProductoDetailController($scope, $rootScope, $stateParams, previousState, DataUtils, entity, Producto) {
        var vm = this;

        vm.producto= entity;
        vm.previousState = previousState.name;
        vm.byteSize = DataUtils.byteSize;
        vm.openFile = DataUtils.openFile;

        var unsubscribe = $rootScope.$on('kukulkanmongoApp:productoUpdate', function(event, result) {
            vm.producto= result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
