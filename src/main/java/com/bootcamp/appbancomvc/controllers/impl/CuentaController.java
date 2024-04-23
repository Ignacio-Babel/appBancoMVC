package com.bootcamp.appbancomvc.controllers.impl;

import com.bootcamp.appbancomvc.controllers.ICuentaController;
import com.bootcamp.appbancomvc.models.Cuenta;
import com.bootcamp.appbancomvc.services.ICuentaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuentas")
public class CuentaController implements ICuentaController {

	ICuentaService cuentaService;

	public CuentaController(ICuentaService cuentaService){
		this.cuentaService = cuentaService;
	}
	@PostMapping
	@Override
	public int nuevaCuenta(@RequestBody Cuenta cuenta) {
		return this.cuentaService.nuevaCuenta(cuenta);
	}

	@PutMapping("/{idCuenta}")
	@Override
	public void mod(@PathVariable int idCuenta,@RequestBody Cuenta cuenta) {
		this.cuentaService.mod(idCuenta, cuenta);
	}

	@GetMapping
	@Override
	public List<Cuenta> list() {
		return this.cuentaService.list();
	}

	@DeleteMapping("/{idCuenta}")
	@Override
	public Cuenta delete(@PathVariable int idCuenta) {
		return this.cuentaService.delete(idCuenta);
	}
}
