Cliente c = new ClienteVip(...) compila. Todo ClienteVip é um Cliente, então o objeto filho pode ser guardado numa referência do pai (upcast implícito).

ClienteVip v = new Cliente(...) não compila. Um Cliente não é um ClienteVip, pois nem todo cliente é VIP. O compilador não aceita guardar o pai numa referência do filho sem cast, e esse cast falharia em execução.