package ru.akaleganov.job4j_url_shortcut.web.rest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.akaleganov.job4j_url_shortcut.domain.Role;
import ru.akaleganov.job4j_url_shortcut.service.UrlFilter;
import ru.akaleganov.job4j_url_shortcut.service.UrlService;
import ru.akaleganov.job4j_url_shortcut.service.dto.UrlDTO;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class UrlController {
private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    /**
     * добавить новый урл
     * @return получить назад урл
     */
    @PostMapping("/url")
    public ResponseEntity<UrlDTO> addUrl(@RequestBody String url, Principal principal) {
        return ResponseEntity.ok().body(this.urlService.addUrl(url, principal.getName()));
    }
    /**
     * добавить новый урл
     * @return получить назад урл
     */
    @GetMapping("/url")
    public ResponseEntity<Page<UrlDTO>> findAllUrl(Pageable pageable, UrlFilter urlFilter) {
        return ResponseEntity.ok().body(this.urlService.findAllURl(pageable, urlFilter));
    }
    /**
     * добавить новый урл
     * @return получить назад урл
     */
    @GetMapping("/getUrlByShortCut/{shortCut}")
    public ResponseEntity<UrlDTO> findAllUrl(@PathVariable String shortCut) {
        return ResponseEntity.ok().body(this.urlService.findUrlByShortCut(shortCut));
    }

}

