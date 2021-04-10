package com.momentum.api.Infrastructure.models;

public class Purchase {

    private _id _idObject;
    private String Id;
    private String Customer;
    private String Products;

    public Purchase() {
        super();
    }

    public _id get_idObject() {
        return _idObject;
    }

    public void set_idObject(_id _idObject) {
        this._idObject = _idObject;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public String getProducts() {
        return Products;
    }

    public void setProducts(String products) {
        Products = products;
    }

// Getter Methods

    public _id get_id() {
        return _idObject;
    }

    public void set_id(_id _idObject) {
        this._idObject = _idObject;
    }


    // Setter Methods

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "_idObject=" + _idObject +
                ", Id='" + Id + '\'' +
                ", Customer='" + Customer + '\'' +
                ", Products='" + Products + '\'' +
                '}';
    }

    public class _id {
        private String $oid;


        // Getter Methods

        public String get$oid() {
            return $oid;
        }

        // Setter Methods

        public void set$oid(String $oid) {
            this.$oid = $oid;
        }
    }
}
