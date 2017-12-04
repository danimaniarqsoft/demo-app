(function() {
    'use strict';

    angular
        .module('kukulkanmongoApp')
        .controller('UsuarioDetailController', UsuarioDetailController);

    UsuarioDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'DataUtils', 'entity', 'Usuario'];

    function UsuarioDetailController($scope, $rootScope, $stateParams, previousState, DataUtils, entity, Usuario) {
        var vm = this;

        vm.usuario= entity;
        vm.previousState = previousState.name;
        vm.byteSize = DataUtils.byteSize;
        vm.openFile = DataUtils.openFile;

        var unsubscribe = $rootScope.$on('kukulkanmongoApp:usuarioUpdate', function(event, result) {
            vm.usuario= result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
