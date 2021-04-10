package com.momentum.api.Infrastructure.models;

public class Customer {
    private _id _idObject;
    private String Id;
    private String Points;
    private String Name;
    private String ActiveDays;

    public Customer() {
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

    public String getPoints() {
        return Points;
    }

    // Setter Methods

    public void setPoints(String Points) {
        this.Points = Points;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getActiveDays() {
        return ActiveDays;
    }

    public void setActiveDays(String ActiveDays) {
        this.ActiveDays = ActiveDays;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "_idObject=" + _idObject +
                ", Id='" + Id + '\'' +
                ", Points='" + Points + '\'' +
                ", Name='" + Name + '\'' +
                ", ActiveDays='" + ActiveDays + '\'' +
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
