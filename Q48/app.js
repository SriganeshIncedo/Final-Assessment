var express = require('express');
var routes = require('./routers');
var app = express();
const bodyParser = require("body-parser");

app
    .use(bodyParser.json({ limit: "50mb" }))
    .use(bodyParser.urlencoded({ limit: "50mb", extended: true, parameterLimit: 50000 }))
    .use("/users", routes)
   

    
module.exports = app;

var server = app.listen(5000, function () {console.log("Mr.Mullapudi Sriganesh all parameters running successfully, We are good to go") });
