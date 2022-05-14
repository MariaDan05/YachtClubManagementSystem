package com.example;

public class MembershipFee {
    private Member member;

    public MembershipFee(Member member) {
        this.member = member;
    }

    public double totalMembershipFee(double feePerBoat) {
        return member.boatCount() * feePerBoat;
    }

}
