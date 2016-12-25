# shop-discovery

### Prerequisites
Maven <br />
Java 1.6+

### Steps to run this application (Spring Boot)
1. Download as Zip or Clone this repository.
2. Go to root folder
3. In terminal execute **mvn spring-boot:run**
4. The application should be listening on http://localhost:8080/
5. ***In case port 8080 is not available, please change the configuration in application.properties (server.port = {portNum})***

### API Docs
1. **ADD Shop**
   Endpoint : http://localhost:8080/shops <br />
   Method: POST <br />
   ***Sample Post Request Body***
   
   ```json
   { "shopName":"shop3",
     "shopAddress":{
        "postCode":"33131",
        "number":"B124"   
      }     
   }
   ```
2. **Get Nearest Shop**
   Endpoint : http://localhost:8080/shop/nearest?lat={lattitude}&lon={longitude} <br />
   Method: GET <br />
   
   ***Sample Response***
  ```json
  {
  "shopName": "shop3",
  "shopAddress": {
    "shopNumber": "B124",
    "zipCode": "33131"
  },
  "shopLongitude": -80.1847167,
  "shopLatitude": 25.76528
  }
  ```
3. **Get all shops**
    Endpoint : http://localhost:8080/shops <br />
    Method: GET <br />
    
    ***Sample Response***
    
  ```json
  [
  {
    "shopName": "shop3",
    "shopAddress": {
      "shopNumber": "B124",
      "zipCode": "33131"
    },
    "shopLongitude": -80.1847167,
    "shopLatitude": 25.76528
  },
  {
    "shopName": "shop2",
    "shopAddress": {
      "shopNumber": "B124",
      "zipCode": "411028"
    },
    "shopLongitude": 73.9261587,
    "shopLatitude": 18.5149325
  },
  {
    "shopName": "shop1",
    "shopAddress": {
      "shopNumber": "B124",
      "zipCode": "31334"
    },
    "shopLongitude": 1.2915859,
    "shopLatitude": 43.376343
  }
]
```
