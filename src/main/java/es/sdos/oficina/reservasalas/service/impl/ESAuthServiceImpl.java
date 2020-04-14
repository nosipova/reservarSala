package es.sdos.oficina.reservasalas.service.impl;

import org.springframework.stereotype.Service;

import es.sdos.oficina.reservasalas.service.ESAuthService;

@Service
public class ESAuthServiceImpl implements ESAuthService {

	@Override
	public boolean isAdmin(String key) {
		return "admin".equals(key);
	}

}
