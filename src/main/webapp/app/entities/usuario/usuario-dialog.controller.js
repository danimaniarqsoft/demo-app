(function() {
    'use strict';

    angular
        .module('kukulkanmongoApp')
        .controller('UsuarioDialogController', UsuarioDialogController);

    UsuarioDialogController.$inject = ['$timeout', '$scope', '$stateParams', '$uibModalInstance', 'DataUtils', 'entity', 'Usuario'];

    function UsuarioDialogController ($timeout, $scope, $stateParams, $uibModalInstance, DataUtils, entity, Usuario) {
        var vm = this;

        vm.usuario = entity;
        vm.clear = clear;
        vm.datePickerOpenStatus = {};
        vm.openCalendar = openCalendar;
        vm.byteSize = DataUtils.byteSize;
        vm.openFile = DataUtils.openFile;
        vm.save = save;
          
        vm.datePickerOpenStatus.fechaLocalDate = false;
        vm.datePickerOpenStatus.fechaZoneDateTime = false;

        $timeout(function (){
            angular.element('.form-group:eq(1)>input').focus();
        });

        function clear () {
            $uibModalInstance.dismiss('cancel');
        }

        function save () {
            vm.isSaving = true;
            if (vm.usuario.id !== null) {
                Usuario.update(vm.usuario, onSaveSuccess, onSaveError);
            } else {
                Usuario.save(vm.usuario, onSaveSuccess, onSaveError);
            }
        }

        function onSaveSuccess (result) {
            $scope.$emit('kukulkanmongoApp:usuarioUpdate', result);
            $uibModalInstance.close(result);
            vm.isSaving = false;
        }

        function onSaveError () {
            vm.isSaving = false;
        }
        
        vm.setImagen = function ($file, usuario) {
            if ($file) {
                DataUtils.toBase64($file, function(base64Data) {
                    $scope.$apply(function() {
                        usuario.imagen = base64Data;
                        usuario.imagenContentType = $file.type;
                    });
                });
            }
        };
        vm.setDesc = function ($file, usuario) {
            if ($file) {
                DataUtils.toBase64($file, function(base64Data) {
                    $scope.$apply(function() {
                        usuario.desc = base64Data;
                        usuario.descContentType = $file.type;
                    });
                });
            }
        };

        function openCalendar (date) {
            vm.datePickerOpenStatus[date] = true;
        }
    }
})();
