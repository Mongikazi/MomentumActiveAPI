**REST-based service**
----------------------------------------------------------
  HOW TO DO IT
-----------------------------------------------------------



* **URL**
PRODUCT------------
localhost:8080/momentum-active/products : GET
localhost:8080/momentum-active/product/{id} : GET 

CUSTOMER------------
localhost:8080/momentum-active/customers : GET
localhost:8080/momentum-active/customer/{id} : GET 

STORE------------
localhost:8080/momentum-active/purchases : GET
localhost:8080/momentum-active/purchase/{id} : GET 
localhost:8080/momentum-active/purchase : POST

* **Method:**
  
  `GET` | `POST` | `DELETE` | `PUT`
  
*  **URL Params**


   **Required:**
 
   `id=[integer]`
   
* **Data Params**



* **Success Response:**


  * **Code:** 200 OK <br />
    **Content:** `[
    {
        "id": "Sajal",
        "name": "IV",
        "activeDays": 60,
        "points": 90
    },
    {
        "id": "Lokesh",
        "name": "V",
        "activeDays": 77,
        "points": 98
    }
]`
 
* **Error Response:**

  * **Code:** 500 <br />
    **Content:** `{ error : "Internal Server Error" }`

 Error Response:

Code: 401 UNAUTHORIZED
Content: { error : "You are unauthorized to make this request." }

* **Sample Call:**

  <_Just a sample call to your endpoint in a runnable format ($.ajax call or a curl request) - this makes life easier and more predictable._> 


