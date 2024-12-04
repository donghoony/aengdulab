package com.aengdulab.ticket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberTicketService {

    private final TicketIssueService ticketIssueService;

    public synchronized void issue(long memberId, long ticketId) {
        ticketIssueService.issue(memberId, ticketId);
    }
}
