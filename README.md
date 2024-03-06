### Spring Boot Many to Many relation example
# In this code there are 2 entities representing 2 tables in a DB.
Vehicles and Taxicos represent sets of all vehicles and all Taxi companies related with eachother.
# In the VehicleService, the data that is returned is converted to a DTO for managing potential error 
# In Taxicos the data is not altered in the TaxicosService to demonstrate the infinite recurency / circular query problem
