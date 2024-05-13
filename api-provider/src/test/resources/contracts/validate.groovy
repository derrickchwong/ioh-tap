import org.springframework.cloud.contract.spec.Contract
[
Contract.make {
    description "Should add a new contact"
    request {
        method POST()
        url("/contacts")
        body(
                id: $(regex("[0-9]+")),
                phone: $(regex("[0-9]{8}"))
        )
        headers {
            contentType(applicationJson())
        } 
    }
    response {
        status 200
        body(
                id: fromRequest().body('$.id'),
                phone: fromRequest().body('$.phone')
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
                id: $(regex("[0-9]+")),
                phone: $(regex("^(?![0-9]{8}\$).*\$"))
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
                id: $(regex("[0-9]+")),
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
                phone: $(regex("[0-9]{8}"))
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
    description "Should return bad request for missing id and missing phone"
    request {
        method POST()
        url("/contacts")
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 400
    }
}
]
