(function() {
    'use strict';

    angular
        .module('kukulkanmongoApp')
        .factory('ProductoSearch', ProductoSearch);

    ProductoSearch.$inject = ['$resource'];

    function ProductoSearch($resource) {
        var resourceUrl =  'api/_search/productos/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true}
        });
    }
})();
