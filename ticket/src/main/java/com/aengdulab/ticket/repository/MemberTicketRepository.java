package com.aengdulab.ticket.repository;

import com.aengdulab.ticket.domain.Member;
import com.aengdulab.ticket.domain.MemberTicket;
import com.aengdulab.ticket.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberTicketRepository extends JpaRepository<MemberTicket, Long> {

    int countByMemberAndTicket(Member member, Ticket ticket);
}