package no.dsb.nlfp.ui.controller;

import no.dsb.nlfp.ui.dto.ConfigDto;
import no.dsb.nlfp.ui.service.ConfigService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/config")
public class ConfigController {

    private ConfigService service;

    public ConfigController(ConfigService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ConfigDto> getAppConfig() {
        return ok(service.getAppConfig());
    }
}
