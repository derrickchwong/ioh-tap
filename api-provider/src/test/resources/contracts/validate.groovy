import org.springframework.cloud.contract.spec.Contract
[
Contract.make {
    description "Should add a new contact"
    request {
        method POST()
        url("/contacts")
        body(
                id: "1",
                phone: "12345678"
        )
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 200
        body(
                id: "1",
                phone: "12345678"
        )
        headers {
            contentType(applicationJson())
        }
    }
}
,
Contract.make {
    description "Should return bad request for invalid phone"
    request {
        method POST()
        url("/contacts")
        body(
                id: "1",
                phone: "1234567"
        )
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 400
    }
}
,
Contract.make {
    description "Should return bad request for missing phone"
    request {
        method POST()
        url("/contacts")
        body(
                id: "1"
        )
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 400
    }
}
,
Contract.make {
    description "Should return bad request for missing id"
    request {
        method POST()
        url("/contacts")
        body(
                phone: "12345678"
        )
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 400
    }
}
]
