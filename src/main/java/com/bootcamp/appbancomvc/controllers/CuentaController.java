package com.bootcamp.appbancomvc.controllers;

import com.bootcamp.appbancomvc.models.Cuenta;
import com.bootcamp.appbancomvc.models.Sucursal;
import com.bootcamp.appbancomvc.services.ICuentaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cuentas")
public class CuentaController {

	private final ICuentaService cuentaService;

	public CuentaController(ICuentaService cuentaService) {
		this.cuentaService = cuentaService;
	}

	@PostMapping
	public String nuevaCuenta(@ModelAttribute("cuenta") Cuenta cuenta) {
		this.cuentaService.nuevaCuenta(cuenta);
		return "redirect:/cuentas";
	}

	@PostMapping("/{numeroCuenta}")
	public String mod(@PathVariable int numeroCuenta, @RequestParam("balance") float nuevoBalance) {
		this.cuentaService.modBalance(numeroCuenta, nuevoBalance);
		return "redirect:/cuentas";
	}

	@GetMapping("/{numeroCuenta}/info")
	public String showCuentaInfo(@PathVariable int numeroCuenta, Model model) {
		Cuenta cuenta = cuentaService.getCuentaByNumero(numeroCuenta);
		model.addAttribute("cuenta", cuenta);
		return "cuenta-info";
	}

	@GetMapping
	public void list(Model model) {
		model.addAttribute("cuentas", this.cuentaService.list());
	}

	@PostMapping("/{numeroCuenta}/delete")
	public String delete(@PathVariable int numeroCuenta) {
		this.cuentaService.delete(numeroCuenta);
		return "redirect:/cuentas";
	}
}
