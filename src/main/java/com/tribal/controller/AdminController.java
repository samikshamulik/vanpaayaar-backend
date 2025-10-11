package com.tribal.controller;

import com.tribal.model.Order;
import com.tribal.model.Seller;
import com.tribal.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    // GET /admin
    @GetMapping("/sellers")
    public ResponseEntity<?> getAllSellers() {
        List<Seller> sellers = adminService.getAllSellers();
        if(sellers.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No seller found !");
        }
        return ResponseEntity.ok(sellers);
    }

    @GetMapping("/sellers/pending")
    public ResponseEntity<?> getPendingSellers(){
        List<Seller> sellers = adminService.getPendingSellers();
        if(sellers.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No pending seller found !");
        }
        return ResponseEntity.ok(sellers);
    }

    @GetMapping("/sellers/{id}")
    public ResponseEntity<?> getSellerbyId(@PathVariable Long id){
        Seller sellers= adminService.getSellerbyId(id);
        if(sellers.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No pending seller found !");
        }
        return ResponseEntity.ok(sellers);
    }



}

