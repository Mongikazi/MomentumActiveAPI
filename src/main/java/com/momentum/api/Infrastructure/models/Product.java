package com.momentum.api.Infrastructure.models;

public class Product {

    private _id _idObject;
    private String Id;
    private String Code;
    private String Description;
    private String Name;
    private String Price;

    public Product() {
        super();
    }

// Getter Methods

    public _id get_id() {
        return _idObject;
    }

    public void set_id(_id _idObject) {
        this._idObject = _idObject;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    // Setter Methods

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "_idObject=" + _idObject +
                ", Id='" + Id + '\'' +
                ", Code='" + Code + '\'' +
                ", Description='" + Description + '\'' +
                ", Name='" + Name + '\'' +
                ", Price='" + Price + '\'' +
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
