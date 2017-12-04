(function() {
    'use strict';

    angular
        .module('kukulkanmongoApp')
        .controller('ProductoDialogController', ProductoDialogController);

    ProductoDialogController.$inject = ['$timeout', '$scope', '$stateParams', '$uibModalInstance', 'DataUtils', 'entity', 'Producto'];

    function ProductoDialogController ($timeout, $scope, $stateParams, $uibModalInstance, DataUtils, entity, Producto) {
        var vm = this;

        vm.producto = entity;
        vm.clear = clear;
        vm.byteSize = DataUtils.byteSize;
        vm.openFile = DataUtils.openFile;
        vm.save = save;
          

        $timeout(function (){
            angular.element('.form-group:eq(1)>input').focus();
        });

        function clear () {
            $uibModalInstance.dismiss('cancel');
        }

        function save () {
            vm.isSaving = true;
            if (vm.producto.id !== null) {
                Producto.update(vm.producto, onSaveSuccess, onSaveError);
            } else {
                Producto.save(vm.producto, onSaveSuccess, onSaveError);
            }
        }

        function onSaveSuccess (result) {
            $scope.$emit('kukulkanmongoApp:productoUpdate', result);
            $uibModalInstance.close(result);
            vm.isSaving = false;
        }

        function onSaveError () {
            vm.isSaving = false;
        }
        
        vm.setImagen = function ($file, producto) {
            if ($file) {
                DataUtils.toBase64($file, function(base64Data) {
                    $scope.$apply(function() {
                        producto.imagen = base64Data;
                        producto.imagenContentType = $file.type;
                    });
                });
            }
        };
        vm.setDescripcion = function ($file, producto) {
            if ($file) {
                DataUtils.toBase64($file, function(base64Data) {
                    $scope.$apply(function() {
                        producto.descripcion = base64Data;
                        producto.descripcionContentType = $file.type;
                    });
                });
            }
        };

    }
})();
