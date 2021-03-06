/*
 * ASN Service
 * This app provides REST APIs for ASN Service
 *
 * OpenAPI spec version: v3
 * Contact: firstname.lastname@company.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.lowes.vendortools.auth;

import java.util.Map;

import com.lowes.vendortools.Pair;

import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
