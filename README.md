**Title**
----------------------------------------------------------
  HOW TO DO IT
-----------------------------------------------------------

Create java maven project : MongoDB Service
This project will setup a connection to a mongodb,
Will setup the actual data manipulation with the database

Create java maven project : StoreService
This Project will create the api, all the endpoints
API Functions and routes, 

Create java maven project : DomainDriven Service
This project will create the integration, should this be required to 
For the api to be able to speak to the database in a form of a service

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

   <_If URL params exist, specify them in accordance with name mentioned in URL section. Separate into optional and required. Document data constraints._> 

   **Required:**
 
   `id=[integer]`
   
* **Data Params**



* **Success Response:**
  
  <_What should the status code be on success and is there any returned data? This is useful when people need to to know what their callbacks should expect!_>

  * **Code:** 200 <br />
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

  <_Most endpoints will have many ways they can fail. From unauthorized access, to wrongful parameters etc. All of those should be liste d here. It might seem repetitive, but it helps prevent assumptions from being made where they should be._>

  * **Code:** 500 <br />
    **Content:** `{ error : "Internal Server Error" }`

 Error Response:

Code: 401 UNAUTHORIZED
Content: { error : "You are unauthorized to make this request." }

* **Sample Call:**

  <_Just a sample call to your endpoint in a runnable format ($.ajax call or a curl request) - this makes life easier and more predictable._> 

* **Notes:**

  <_This is where all uncertainties, commentary, discussion etc. can go. I recommend timestamping and identifying oneself when leaving comments here._> 
