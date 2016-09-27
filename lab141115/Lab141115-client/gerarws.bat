wsimport -p webservices.WebServiceEntrega -keep -d src_ws http://localhost:8080/lab141115/WebServiceEntrega?wsdl

wsimport -p webservices.WebServiceVenda -keep -d src_ws http://localhost:8080/lab141115/WebServiceVenda?wsdl

wsimport -p webservices.WebServiceProduto -keep -d src_ws http://localhost:8080/lab141115/WebServiceProduto?wsdl
pause