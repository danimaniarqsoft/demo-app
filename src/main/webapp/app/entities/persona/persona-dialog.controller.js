(function() {
    'use strict';

    angular
        .module('kukulkanmongoApp')
        .controller('PersonaDialogController', PersonaDialogController);

    PersonaDialogController.$inject = ['$timeout', '$scope', '$stateParams', '$uibModalInstance', 'DataUtils', 'entity', 'Persona'];

    function PersonaDialogController ($timeout, $scope, $stateParams, $uibModalInstance, DataUtils, entity, Persona) {
        var vm = this;

        vm.persona = entity;
        vm.clear = clear;
        vm.save = save;
          

        $timeout(function (){
            angular.element('.form-group:eq(1)>input').focus();
        });

        function clear () {
            $uibModalInstance.dismiss('cancel');
        }

        function save () {
            vm.isSaving = true;
            if (vm.persona.id !== null) {
                Persona.update(vm.persona, onSaveSuccess, onSaveError);
            } else {
                Persona.save(vm.persona, onSaveSuccess, onSaveError);
            }
        }

        function onSaveSuccess (result) {
            $scope.$emit('kukulkanmongoApp:personaUpdate', result);
            $uibModalInstance.close(result);
            vm.isSaving = false;
        }

        function onSaveError () {
            vm.isSaving = false;
        }
        

    }
})();
