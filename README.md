**REST-based service**
----------------------------------------------------------
  HOW TO RUN IT
-----------------------------------------------------------
1. Clone project
2. https://github.com/Mongikazi/MomentumActiveAPI
4. CD/navigate to the root project folder with terminal
5. Run commmand : Java -jar command
6. visit http://localhost:8080/api/swagger-ui.html#/
7. Intergration tests are available here :
 https://gold-station-135366.postman.co/workspace/My-Workspace~f025f041-c5cd-4fff-8abb-ac5af19fd65f/request/15320948-43726d64-cd26-4f78-bf4e-fcf944d1b82c
  
  
* **URL**
http://localhost:8080/api/swagger-ui.html#/ home url

PRODUCT------------
http://localhost:8080/api/products
http://localhost:8080/api/product/{id} 

CUSTOMER------------
http://localhost:8080/api/customers
http://localhost:8080/api/customer/{id} 

STORE------------
http://localhost:8080/api/purchases
http://localhost:8080/api/purchase/{id}
localhost:8080/momentum-active/purchase : POST

* **Method:**
  
  `GET` | `POST` | `DELETE` | `PUT`
  

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




