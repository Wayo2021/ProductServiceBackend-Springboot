package com.learning.productservices.java.config;
//
public class ConfigOne {
//    ConfigOne.validateOrderNewRegister1st(t,t);
//    ConfigOne.validateOrderNewRegister2nd(t,t);
//}
//    public void validateOrderNewRegister1st(CompletionRequestModel reqInfo, List<ErrorDetailsModel> error) throws Exception {
//
//        if (!ObjectUtils.isEmpty(reqInfo.getActivity())) {
//
//
//            if (reqInfo.getActivity().equalsIgnoreCase("1st Submit")) {
//
//                if (ObjectUtils.isEmpty(reqInfo.getProductOrderItem())) {
//                    error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem"));
//
//                } else {
//                    int i = 0;
//                    for (OrderItemModel orderItemlist : reqInfo.getProductOrderItem()) {
//                        if (ObjectUtils.isEmpty(orderItemlist.getActionCd())) {
//                            error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem" + "[" + i + "]." + "ActionCd"));
//                        }
//                        if (ObjectUtils.isEmpty(orderItemlist.getExpirationDate())) {
//                            error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem" + "[" + i + "]." + "ExpirationDate"));
//                        }
//                        i++;
//                    }
//
//                }
//                if (reqInfo.getServiceOrderItem() != null && reqInfo.getServiceOrderItem().size() > 0) {
//
//                    int i = 0;
//                    for (ServiceOrderItem serviceOrderItem : reqInfo.getServiceOrderItem()) {
//                        if (serviceOrderItem.getActionCd() == null || serviceOrderItem.getActionCd().isEmpty()) {
//                            error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ServiceOrderItem" + "[" + i + "]." + "ActionCd"));
//                        }
//                        i++;
//                    }
//                }
//                if (reqInfo.getFeeOrderItem() != null && reqInfo.getFeeOrderItem().size() > 0) {
//                    int i = 0;
//                    for (FeeOrderItem serviceOrderItem : reqInfo.getFeeOrderItem()) {
//                        if (serviceOrderItem.getActionCd() == null || serviceOrderItem.getActionCd().isEmpty()) {
//                            error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "FeeOrderItem" + "[" + i + "]." + "actionCd"));
//                        }
//                        i++;
//                    }
//                }
//
//            }
//
//        }
//
//        // ------------------------------------- 2nb -------------------------------------------------
//        if (reqInfo.getActivity().equalsIgnoreCase("2nd Submit") && !reqInfo.getSubActivity().equalsIgnoreCase("cancel")) {
//            if (ObjectUtils.isEmpty(reqInfo.getUserName())) {
//                error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "UserName"));
//
//            }
//
//        }
//
//        public void validateOrderRelocate1st(CompletionRequestModel reqInfo, List<ErrorDetailsModel> error) throws Exception {
//
//            if (!ObjectUtils.isEmpty(reqInfo.getActivity())) {
//                if (reqInfo.getActivity().equalsIgnoreCase("1st Submit")) {
//
//                    if (ObjectUtils.isEmpty(reqInfo.getProductOrderItem())) {
//                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem"));
//
//                    } else {
//                        int i = 0;
//                        for (OrderItemModel orderItemlist : reqInfo.getProductOrderItem()) {
//                            if (ObjectUtils.isEmpty(orderItemlist.getActionCd())) {
//                                error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem" + "[" + i + "]." + "ActionCd"));
//                            }
//                            if (ObjectUtils.isEmpty(orderItemlist.getExpirationDate())) {
//                                error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem" + "[" + i + "]." + "ExpirationDate"));
//                            }
//                            i++;
//                        }
//
//
//                    }
//                    if (ObjectUtils.isEmpty(reqInfo.getLocationCode())) {
//                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "LocationCode"));
//                    }
//                    if (ObjectUtils.isEmpty(reqInfo.getSubActivity())) {
//                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "SubActivity"));
//                    }
//                    if (ObjectUtils.isEmpty(reqInfo.getServiceLevel())) {
//                        if (ObjectUtils.isEmpty(reqInfo.getCaNumber())) {
//                            error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "CaNumber"));
//                        }
//                    }
//
//                    if (!ObjectUtils.isEmpty(reqInfo.getServiceInstanceItem())) {
//                        if (ObjectUtils.isEmpty(reqInfo.getServiceInstanceItem().getGvProductSeq())) {
//                            error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ServiceInstanceItem" + "." + "GvProductSeq"));
//                        }
//                    }
//                    if (!reqInfo.getSubActivity().equalsIgnoreCase("cancel")) {
//                        if (ObjectUtils.isEmpty(reqInfo.getProductOrderItem())) {
//                            error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem"));
//                        }
//
//
//                    }
//
//                }
//
//            }
//
//            public void validateOrderRelocate2nd(CompletionRequestModel reqInfo, List<ErrorDetailsModel> error) throws Exception {
//
//                if (reqInfo.getActivity().equalsIgnoreCase("2nd Submit") && !reqInfo.getSubActivity().equalsIgnoreCase("cancel")) {
//                    if (ObjectUtils.isEmpty(reqInfo.getUserName())) {
//                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "UserName"));
//                    }
//                    if (ObjectUtils.isEmpty(reqInfo.getSubActivity())) {
//                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "SubActivity"));
//                    }
//                    if (!reqInfo.getSubActivity().equalsIgnoreCase("cancel")) {
//
//                        if (ObjectUtils.isEmpty(reqInfo.getProductOrderItem())) {
//                            error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem"));
//                        } else {
//
//                            int i = 0;
//                            for (OrderItemModel orderItemlist : reqInfo.getProductOrderItem()) {
//                                if (ObjectUtils.isEmpty(orderItemlist.getSffSourceRowId())) {
//                                    error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem" + "[" + i + "]." + "SffSourceRowId"));
//                                }
//                                if (ObjectUtils.isEmpty(orderItemlist.getSiId())) {
//                                    error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem" + "[" + i + "]." + "SiId"));
//                                }
//                                if (ObjectUtils.isEmpty(orderItemlist.getExpirationDate())) {
//                                    error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem" + "[" + i + "]." + "ExpirationDate"));
//                                }
//                                i++;
//
//                            }
//                        }
//                    }
//                } else {  //validate relocate
//                    if (!ObjectUtils.isEmpty(reqInfo.getActivity())) {
//                        if (reqInfo.getActivity().equalsIgnoreCase("1st Submit")) {
//
//                            if (ObjectUtils.isEmpty(reqInfo.getProductOrderItem())) {
//                                error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem"));
//
//                            } else {
//                                int i = 0;
//                                for (OrderItemModel orderItemlist : reqInfo.getProductOrderItem()) {
//                                    if (ObjectUtils.isEmpty(orderItemlist.getActionCd())) {
//                                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem" + "[" + i + "]." + "ActionCd"));
//                                    }
//                                    if (ObjectUtils.isEmpty(orderItemlist.getExpirationDate())) {
//                                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem" + "[" + i + "]." + "ExpirationDate"));
//                                    }
//                                    i++;
//                                }
//
//                            }
//
//                            if (reqInfo.getServiceOrderItem() != null && reqInfo.getServiceOrderItem().size() > 0) {
//
//                                int i = 0;
//                                for (ServiceOrderItem serviceOrderItem : reqInfo.getServiceOrderItem()) {
//                                    if (serviceOrderItem.getActionCd() == null || serviceOrderItem.getActionCd().isEmpty()) {
//                                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ServiceOrderItem" + "[" + i + "]." + "ActionCd"));
//                                    }
//                                    i++;
//                                }
//                            }
//                            if (reqInfo.getFeeOrderItem() != null && reqInfo.getFeeOrderItem().size() > 0) {
//                                int i = 0;
//                                for (FeeOrderItem serviceOrderItem : reqInfo.getFeeOrderItem()) {
//                                    if (serviceOrderItem.getActionCd() == null || serviceOrderItem.getActionCd().isEmpty()) {
//                                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "FeeOrderItem" + "[" + i + "]." + "actionCd"));
//                                    }
//                                    i++;
//                                }
//                            }
//
//                        }
//
//                    }
//                    // ------------------------------------- 2nb -------------------------------------------------
//                    if (reqInfo.getActivity().equalsIgnoreCase("2nd Submit") && !reqInfo.getSubActivity().equalsIgnoreCase("cancel")) {
//                        if (ObjectUtils.isEmpty(reqInfo.getUserName())) {
//                            error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "UserName"));
//                        }
//                        if (ObjectUtils.isEmpty(reqInfo.getSubActivity())) {
//                            error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "SubActivity"));
//                        }
//                        if (!reqInfo.getSubActivity().equalsIgnoreCase("cancel")) {
//                            if (ObjectUtils.isEmpty(reqInfo.getProductOrderItem())) {
//                                error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem"));
//                            } else {
//                                int i = 0;
//                                for (OrderItemModel orderItemlist : reqInfo.getProductOrderItem()) {
//                                    if (ObjectUtils.isEmpty(orderItemlist.getSffSourceRowId())) {
//                                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem" + "[" + i + "]." + "SffSourceRowId"));
//                                    }
//                                    if (ObjectUtils.isEmpty(orderItemlist.getSiId())) {
//                                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem" + "[" + i + "]." + "SiId"));
//                                    }
//                                    if (ObjectUtils.isEmpty(orderItemlist.getExpirationDate())) {
//                                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ProductOrderItem" + "[" + i + "]." + "ExpirationDate"));
//                                    }
//                                    i++;
//                                }
//                            }
//                            if (reqInfo.getServiceOrderItem() != null && reqInfo.getServiceOrderItem().size() > 0) {
//                                int x = 0;
//                                for (ServiceOrderItem serviceOrderItem : reqInfo.getServiceOrderItem()) {
//                                    if (ObjectUtils.isEmpty(serviceOrderItem.getGvParentProductSeq())) {
//                                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "ServiceOrderItem" + "[" + x + "]." + "GvParentProductSeq"));
//                                    }
//                                    x++;
//                                }
//                            }
//                            if (reqInfo.getFeeOrderItem() != null && reqInfo.getFeeOrderItem().size() > 0) {
//                                int i = 0;
//                                for (FeeOrderItem serviceOrderItem : reqInfo.getFeeOrderItem()) {
//                                    if (serviceOrderItem.getActionCd() == null || serviceOrderItem.getActionCd().isEmpty()) {
//                                        error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "FeeOrderItem" + "[" + i + "]." + "actionCd"));
//                                    }
//                                    i++;
//
//                                }
//                                if (reqInfo.getFeeOrderItem() != null && reqInfo.getFeeOrderItem().size() > 0) {
//                                    int i = 0;
//                                    for (FeeOrderItem feeOrderItem : reqInfo.getFeeOrderItem()) {
//                                        if (feeOrderItem.getActionCd() == null || feeOrderItem.getActionCd().isEmpty()) {
//                                            error.add(new ErrorDetailsModel(ErrorMsgConstants.VALIDATE.VALIDATION_ERROR, "FeeOrderItem" + "[" + i + "]." + "actionCd"));
//
//                                        }
//                                    }
//                                }
//                            }
//                        }
//
//                        if (error.size() > 0)
//                            throw new QualificationExeption(MsgPattern.VALIDATE_REQUEST_FAIL, Collections.singletonList(error));
//                    }


        public static void main(String[]args){

            String me = "แสบตา";

            if (me == me){

                System.out.println(" I contact to the screen. ");

            }
        }
}