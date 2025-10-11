package com.tribal.service.impl;

import com.tribal.model.*;
import com.tribal.repository.AdminRepository;
import com.tribal.repository.SellerRepository;
import com.tribal.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service

public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public Map<String, Object> getDashboardMetrics() {
        return Map.of();
    }

    @Override
    public List<Seller> getAllSellers(){

        return sellerRepository.findAll();
    }

    @Override
    public List<Seller> getPendingSellers() {
        return sellerRepository.findByAdminApprovalStatus("PENDING");
    }

    @Override
    public Seller getSellerbyId(Long sellerId) {
        List<Integer> ids = sellerRepository.fi
        return sellerRepository.getById(sellerId);
    }

    @Override
    public Seller approveSeller(Long sellerId) {
        return null;
    }

    @Override
    public Seller suspendSeller(Long sellerId) {
        return null;
    }

    @Override
    public void deleteSeller(Long sellerId) {

    }

    @Override
    public List<Buyer> getAllBuyers() {
        return List.of();
    }

    @Override
    public Buyer suspendBuyer(Long buyerId) {
        return null;
    }

    @Override
    public Buyer getBuyerbyId(Long buyerId) {
        return null;
    }

    @Override
    public void deleteBuyer(Long buyerId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Product> getPendingProducts() {
        return List.of();
    }

    @Override
    public Product approveProduct(Long productId) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public List<Order> getAllOrders() {
        return List.of();
    }

    @Override
    public List<Coupon> getAllCoupons() {
        return List.of();
    }

    @Override
    public Coupon createCoupon(Coupon coupon) {
        return null;
    }

    @Override
    public Coupon updateCoupon(Long couponId, Coupon couponDetails) {
        return null;
    }

    @Override
    public void deactivateCoupon(Long couponId) {

    }

    @Override
    public void deleteCoupon(Long couponId) {

    }

    @Override
    public List<Complaint> getAllComplaints() {
        return List.of();
    }

    @Override
    public Complaint resolveComplaint(Long complaintId) {
        return null;
    }

    @Override
    public Complaint closeComplaint(Long complaintId) {
        return null;
    }

    @Override
    public Admin getProfile() {
        return null;
    }

    @Override
    public Admin updateProfile(Admin updatedAdmin) {
        return null;
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {

    }
}
