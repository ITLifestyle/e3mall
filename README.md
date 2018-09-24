# e3mall

modules
    Common : entities
    Dao : mapper, generator
    Service : service interface, service impl
    Web : web, controller

page template : jsp

*Directory Structure*
ShoppingMall (pom)
    Common (jar)
    Dao (jar)
    Service (war)
    Web (war)
    
    Dependency
       Service
              Common
              Dao
       Web
              Common
