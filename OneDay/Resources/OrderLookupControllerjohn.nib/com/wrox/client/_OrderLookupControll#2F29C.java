// _OrderLookupController_EOArchive.java
// Generated by EnterpriseObjects palette at Tuesday, September 18, 2001 12:04:14 Etc/GMT

package com.wrox.client;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eodistribution.client.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.text.*;

public class _OrderLookupController_EOArchive extends com.webobjects.eoapplication.EOArchive {
    com.webobjects.eocontrol.EODetailDataSource _eoDetailDataSource0;
    com.webobjects.eocontrol.EOEditingContext _eoEditingContext0;
    com.webobjects.eodistribution.client.EODistributedDataSource _eoDistributedDataSource0;
    com.webobjects.eointerface.EODisplayGroup _eoDisplayGroup0, _eoDisplayGroup1, _eoDisplayGroup2;
    com.webobjects.eointerface.EOMasterDetailAssociation _eoMasterDetailAssociation0;
    com.webobjects.eointerface.EOTableAssociation _eoTableAssociation0, _eoTableAssociation1;
    com.webobjects.eointerface.EOTableColumnAssociation _eoTableColumnAssociation0, _eoTableColumnAssociation1, _eoTableColumnAssociation2, _eoTableColumnAssociation3, _eoTableColumnAssociation4, _eoTableColumnAssociation5, _eoTableColumnAssociation6;
    com.webobjects.eointerface.EOTextAssociation _eoTextAssociation0, _eoTextAssociation1, _eoTextAssociation2;
    com.webobjects.eointerface.swing.EOForm _nsForm0;
    com.webobjects.eointerface.swing.EOFormCell _eoFormCell0, _eoFormCell1, _eoFormCell2;
    com.webobjects.eointerface.swing.EOFrame _eoFrame0;
    com.webobjects.eointerface.swing.EOMatrix _nsMatrix0, _nsMatrix1;
    com.webobjects.eointerface.swing.EOTable _nsTableView0, _nsTableView1;
    com.webobjects.foundation.NSNumberFormatter _nsNumberFormatter0, _nsNumberFormatter1, _nsNumberFormatter2;
    com.webobjects.foundation.NSTimestampFormatter _nsTimestampFormatter0;
    javax.swing.JButton _jButton0, _jButton1, _jButton2, _jButton3, _nsButton0, _nsButton1, _nsButton2;
    javax.swing.JPanel _nsView0;
    javax.swing.table.TableColumn _tableColumn0, _tableColumn1, _tableColumn2, _tableColumn3, _tableColumn4, _tableColumn5, _tableColumn6;

    public _OrderLookupController_EOArchive(Object owner, NSDisposableRegistry registry) {
        super(owner, registry);
    }

    protected void _construct() {
        Object owner = _owner();
        EOArchive._ObjectInstantiationDelegate delegate = (owner instanceof EOArchive._ObjectInstantiationDelegate) ? (EOArchive._ObjectInstantiationDelegate)owner : null;
        Object replacement;

        super._construct();

        _nsMatrix1 = (com.webobjects.eointerface.swing.EOMatrix)_registered(new com.webobjects.eointerface.swing.EOMatrix(1, 2, 9, 5), "NSMatrix1");
        _nsMatrix0 = (com.webobjects.eointerface.swing.EOMatrix)_registered(new com.webobjects.eointerface.swing.EOMatrix(1, 2, 9, 5), "NSMatrix");
        _jButton3 = (javax.swing.JButton)_registered(new javax.swing.JButton("Add"), "NSButtonCell");
        _jButton2 = (javax.swing.JButton)_registered(new javax.swing.JButton("Remove"), "NSButton2");
        _nsNumberFormatter2 = (com.webobjects.foundation.NSNumberFormatter)_registered(new com.webobjects.foundation.NSNumberFormatter("0;-0"), "NSNumberFormatter");
        _tableColumn6 = (javax.swing.table.TableColumn)_registered(new javax.swing.table.TableColumn(), "NSTableColumn2");
        _nsTableView1 = (com.webobjects.eointerface.swing.EOTable)_registered(new com.webobjects.eointerface.swing.EOTable(), "");
        _eoTableColumnAssociation6 = (com.webobjects.eointerface.EOTableColumnAssociation)_registered(new com.webobjects.eointerface.EOTableColumnAssociation(_tableColumn6, _nsTableView1), "");
        _nsNumberFormatter1 = (com.webobjects.foundation.NSNumberFormatter)_registered(new com.webobjects.foundation.NSNumberFormatter("0;-0"), "NSNumberFormatter");
        _tableColumn5 = (javax.swing.table.TableColumn)_registered(new javax.swing.table.TableColumn(), "NSTableColumn1");
        _eoTableColumnAssociation5 = (com.webobjects.eointerface.EOTableColumnAssociation)_registered(new com.webobjects.eointerface.EOTableColumnAssociation(_tableColumn5, _nsTableView1), "");
        _tableColumn4 = (javax.swing.table.TableColumn)_registered(new javax.swing.table.TableColumn(), "NSTableColumn");
        _eoTableColumnAssociation4 = (com.webobjects.eointerface.EOTableColumnAssociation)_registered(new com.webobjects.eointerface.EOTableColumnAssociation(_tableColumn4, _nsTableView1), "");
        _eoTableAssociation1 = (com.webobjects.eointerface.EOTableAssociation)_registered(new com.webobjects.eointerface.EOTableAssociation(_nsTableView1), "");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "editingContext")) != null)) {
            _eoEditingContext0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eocontrol.EOEditingContext)replacement;
            _replacedObjects.setObjectForKey(replacement, "_eoEditingContext0");
        } else {
            _eoEditingContext0 = ((com.webobjects.eocontrol.EOEditingContext.substitutionEditingContext() != null) ? com.webobjects.eocontrol.EOEditingContext.substitutionEditingContext() : (com.webobjects.eocontrol.EOEditingContext)_registered(new com.webobjects.eocontrol.EOEditingContext(), "EditingContext"));
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "displayGroup.dataSource")) != null)) {
            _eoDistributedDataSource0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eodistribution.client.EODistributedDataSource)replacement;
            _replacedObjects.setObjectForKey(replacement, "_eoDistributedDataSource0");
        } else {
            _eoDistributedDataSource0 = (com.webobjects.eodistribution.client.EODistributedDataSource)_registered(new com.webobjects.eodistribution.client.EODistributedDataSource(_eoEditingContext0, "Order"), "");
        }

        _eoDetailDataSource0 = (com.webobjects.eocontrol.EODetailDataSource)_registered(new com.webobjects.eocontrol.EODetailDataSource(_eoDistributedDataSource0, "lineItems"), "");
        _eoDisplayGroup0 = (com.webobjects.eointerface.EODisplayGroup)_registered(new com.webobjects.eointerface.EODisplayGroup(), "LineItem");
        _eoMasterDetailAssociation0 = (com.webobjects.eointerface.EOMasterDetailAssociation)_registered(new com.webobjects.eointerface.EOMasterDetailAssociation(_eoDisplayGroup0), "");
        _eoFormCell2 = (com.webobjects.eointerface.swing.EOFormCell)_registered(new com.webobjects.eointerface.swing.EOFormCell(), "NSFormCell2");
        _eoTextAssociation2 = (com.webobjects.eointerface.EOTextAssociation)_registered(new com.webobjects.eointerface.EOTextAssociation(_eoFormCell2), "");
        _eoFormCell1 = (com.webobjects.eointerface.swing.EOFormCell)_registered(new com.webobjects.eointerface.swing.EOFormCell(), "NSFormCell1");
        _eoTextAssociation1 = (com.webobjects.eointerface.EOTextAssociation)_registered(new com.webobjects.eointerface.EOTextAssociation(_eoFormCell1), "");
        _nsButton2 = (javax.swing.JButton)_registered(new javax.swing.JButton("Query"), "NSButton1");
        _nsButton1 = (javax.swing.JButton)_registered(new javax.swing.JButton("Fetch"), "NSButton");
        _jButton1 = (javax.swing.JButton)_registered(new javax.swing.JButton("Insert"), "NSButtonCell");
        _jButton0 = (javax.swing.JButton)_registered(new javax.swing.JButton("Delete"), "NSButton2");
        _nsNumberFormatter0 = (com.webobjects.foundation.NSNumberFormatter)_registered(new com.webobjects.foundation.NSNumberFormatter("0;-0"), "NSNumberFormatter");
        _tableColumn3 = (javax.swing.table.TableColumn)_registered(new javax.swing.table.TableColumn(), "NSTableColumn3");
        _nsTableView0 = (com.webobjects.eointerface.swing.EOTable)_registered(new com.webobjects.eointerface.swing.EOTable(), "");
        _eoTableColumnAssociation3 = (com.webobjects.eointerface.EOTableColumnAssociation)_registered(new com.webobjects.eointerface.EOTableColumnAssociation(_tableColumn3, _nsTableView0), "");
        _nsTimestampFormatter0 = (com.webobjects.foundation.NSTimestampFormatter)_registered(new com.webobjects.foundation.NSTimestampFormatter("%A, %B %d, %Y"), "NSDateFormatter");
        _tableColumn2 = (javax.swing.table.TableColumn)_registered(new javax.swing.table.TableColumn(), "NSTableColumn2");
        _eoTableColumnAssociation2 = (com.webobjects.eointerface.EOTableColumnAssociation)_registered(new com.webobjects.eointerface.EOTableColumnAssociation(_tableColumn2, _nsTableView0), "");
        _tableColumn1 = (javax.swing.table.TableColumn)_registered(new javax.swing.table.TableColumn(), "NSTableColumn1");
        _eoTableColumnAssociation1 = (com.webobjects.eointerface.EOTableColumnAssociation)_registered(new com.webobjects.eointerface.EOTableColumnAssociation(_tableColumn1, _nsTableView0), "");
        _tableColumn0 = (javax.swing.table.TableColumn)_registered(new javax.swing.table.TableColumn(), "NSTableColumn");
        _eoTableColumnAssociation0 = (com.webobjects.eointerface.EOTableColumnAssociation)_registered(new com.webobjects.eointerface.EOTableColumnAssociation(_tableColumn0, _nsTableView0), "");
        _eoTableAssociation0 = (com.webobjects.eointerface.EOTableAssociation)_registered(new com.webobjects.eointerface.EOTableAssociation(_nsTableView0), "");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "controllerDisplayGroup")) != null)) {
            _eoDisplayGroup2 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.EODisplayGroup)replacement;
            _replacedObjects.setObjectForKey(replacement, "_eoDisplayGroup2");
        } else {
            _eoDisplayGroup2 = (com.webobjects.eointerface.EODisplayGroup)_registered(new com.webobjects.eointerface.EODisplayGroup(), "Controller");
        }

        _nsButton0 = (javax.swing.JButton)_registered(new javax.swing.JButton("Save"), "NSButton21");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "displayGroup")) != null)) {
            _eoDisplayGroup1 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.EODisplayGroup)replacement;
            _replacedObjects.setObjectForKey(replacement, "_eoDisplayGroup1");
        } else {
            _eoDisplayGroup1 = (com.webobjects.eointerface.EODisplayGroup)_registered(new com.webobjects.eointerface.EODisplayGroup(), "Order");
        }

        _eoFormCell0 = (com.webobjects.eointerface.swing.EOFormCell)_registered(new com.webobjects.eointerface.swing.EOFormCell(), "NSFormCell");
        _eoTextAssociation0 = (com.webobjects.eointerface.EOTextAssociation)_registered(new com.webobjects.eointerface.EOTextAssociation(_eoFormCell0), "");
        _nsForm0 = (com.webobjects.eointerface.swing.EOForm)_registered(new com.webobjects.eointerface.swing.EOForm(3, 1, 1, 3), "");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "component")) != null)) {
            _eoFrame0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOFrame)replacement;
            _replacedObjects.setObjectForKey(replacement, "_eoFrame0");
        } else {
            _eoFrame0 = (com.webobjects.eointerface.swing.EOFrame)_registered(new com.webobjects.eointerface.swing.EOFrame(), "MasterWindow");
        }

        _nsView0 = (JPanel)_eoFrame0.getContentPane();
    }

    protected void _awaken() {
        super._awaken();

        if (_replacedObjects.objectForKey("_eoDisplayGroup1") == null) {
            _connect(_owner(), _eoDisplayGroup1, "displayGroup");
        }

        if (_replacedObjects.objectForKey("_eoDisplayGroup2") == null) {
            _connect(_owner(), _eoDisplayGroup2, "controllerDisplayGroup");
        }

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _connect(_owner(), _eoFrame0, "component");
        }

        if (_replacedObjects.objectForKey("_eoEditingContext0") == null) {
            _connect(_owner(), _eoEditingContext0, "editingContext");
        }
    }

    protected void _init() {
        super._init();
        _jButton2.setSize(82, 25);
        _jButton2.setLocation(4, 4);
        _nsMatrix1.add(_jButton2);
        _jButton3.setSize(82, 25);
        _jButton3.setLocation(94, 4);
        _nsMatrix1.add(_jButton3);
        _jButton0.setSize(82, 25);
        _jButton0.setLocation(4, 4);
        _nsMatrix0.add(_jButton0);
        _jButton1.setSize(82, 25);
        _jButton1.setLocation(94, 4);
        _nsMatrix0.add(_jButton1);
        _setFontForComponent(_jButton3, "Lucida Grande", 13, Font.PLAIN);
        _jButton3.setMargin(new Insets(0, 2, 0, 2));
        _jButton3.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_eoDisplayGroup0, "insert", _jButton3), ""));
        _setFontForComponent(_jButton2, "Lucida Grande", 13, Font.PLAIN);
        _jButton2.setMargin(new Insets(0, 2, 0, 2));
        _jButton2.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_eoDisplayGroup0, "deleteSelection", _jButton2), ""));
        _nsNumberFormatter2.setLocalizesPattern(true);
        _eoTableColumnAssociation6.bindAspect(com.webobjects.eointerface.EOAssociation.ValueAspect, _eoDisplayGroup0, "price");
        if (_eoTableColumnAssociation6.canSupportValueFormatter()) { _eoTableColumnAssociation6.setValueFormatter(_nsNumberFormatter2); }
        _eoTableColumnAssociation6.establishConnection();
        _tableColumn6.setMinWidth(10);
        _tableColumn6.setMaxWidth(1000);
        _tableColumn6.setPreferredWidth(100);
        _tableColumn6.setWidth(100);
        _tableColumn6.setResizable(true);
        _tableColumn6.setHeaderValue("Price");
        _nsNumberFormatter1.setLocalizesPattern(true);
        _eoTableColumnAssociation5.bindAspect(com.webobjects.eointerface.EOAssociation.ValueAspect, _eoDisplayGroup0, "quantity");
        if (_eoTableColumnAssociation5.canSupportValueFormatter()) { _eoTableColumnAssociation5.setValueFormatter(_nsNumberFormatter1); }
        _eoTableColumnAssociation5.establishConnection();
        _tableColumn5.setMinWidth(10);
        _tableColumn5.setMaxWidth(1000);
        _tableColumn5.setPreferredWidth(100);
        _tableColumn5.setWidth(100);
        _tableColumn5.setResizable(true);
        _tableColumn5.setHeaderValue("Quantity");
        _eoTableColumnAssociation4.bindAspect(com.webobjects.eointerface.EOAssociation.ValueAspect, _eoDisplayGroup0, "item.title");
        _eoTableColumnAssociation4.establishConnection();
        _tableColumn4.setMinWidth(10);
        _tableColumn4.setMaxWidth(1000);
        _tableColumn4.setPreferredWidth(100);
        _tableColumn4.setWidth(100);
        _tableColumn4.setResizable(true);
        _tableColumn4.setHeaderValue("Item.title");
        _nsTableView1.table().addColumn(_tableColumn4);
        _nsTableView1.table().addColumn(_tableColumn5);
        _nsTableView1.table().addColumn(_tableColumn6);
        _setFontForComponent(_nsTableView1.table().getTableHeader(), "Lucida Grande", 11, Font.PLAIN);
        _eoTableAssociation1.bindAspect(com.webobjects.eointerface.EOAssociation.SourceAspect, _eoDisplayGroup0, "");
        _eoTableAssociation1.setSortsByColumnOrder(true);
        _eoTableAssociation1.establishConnection();
        _connect(_eoDisplayGroup0, _eoDetailDataSource0, "dataSource");
        _eoDisplayGroup0.setValidatesChangesImmediately(false);
        _eoDisplayGroup0.setFetchesOnLoad(false);
        _eoDisplayGroup0.setUsesOptimisticRefresh(false);
        _eoDisplayGroup0.setSelectsFirstObjectAfterFetch(true);
        _eoMasterDetailAssociation0.bindAspect(com.webobjects.eointerface.EOAssociation.ParentAspect, _eoDisplayGroup1, "lineItems");
        _eoMasterDetailAssociation0.establishConnection();
        _setFontForComponent(_eoFormCell2, "Lucida Grande", 13, Font.PLAIN);
        _eoFormCell2.setTitle("customer.email");
        _eoFormCell2.setTitleWidth(167);
        _eoFormCell2.titleComponent().setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        _eoTextAssociation2.bindAspect(com.webobjects.eointerface.EOAssociation.ValueAspect, _eoDisplayGroup1, "@query=.customer.email");
        _eoTextAssociation2.setUsesDefaultBackgroundColors(false);
        _eoTextAssociation2.establishConnection();
        _setFontForComponent(_eoFormCell1, "Lucida Grande", 13, Font.PLAIN);
        _eoFormCell1.setTitle("customer.loginName");
        _eoFormCell1.setTitleWidth(167);
        _eoFormCell1.titleComponent().setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        _eoTextAssociation1.bindAspect(com.webobjects.eointerface.EOAssociation.ValueAspect, _eoDisplayGroup1, "@query=.customer.loginName");
        _eoTextAssociation1.setUsesDefaultBackgroundColors(false);
        _eoTextAssociation1.establishConnection();
        _setFontForComponent(_nsButton2, "Lucida Grande", 13, Font.PLAIN);
        _nsButton2.setMargin(new Insets(0, 2, 0, 2));
        _nsButton2.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_eoDisplayGroup1, "qualifyDataSource", _nsButton2), ""));
        _setFontForComponent(_nsButton1, "Lucida Grande", 13, Font.PLAIN);
        _nsButton1.setMargin(new Insets(0, 2, 0, 2));
        _nsButton1.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_eoDisplayGroup1, "fetch", _nsButton1), ""));
        _setFontForComponent(_jButton1, "Lucida Grande", 13, Font.PLAIN);
        _jButton1.setMargin(new Insets(0, 2, 0, 2));
        _jButton1.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_eoDisplayGroup1, "insert", _jButton1), ""));
        _setFontForComponent(_jButton0, "Lucida Grande", 13, Font.PLAIN);
        _jButton0.setMargin(new Insets(0, 2, 0, 2));
        _jButton0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_eoDisplayGroup1, "deleteSelection", _jButton0), ""));
        _nsNumberFormatter0.setLocalizesPattern(true);
        _eoTableColumnAssociation3.bindAspect(com.webobjects.eointerface.EOAssociation.ValueAspect, _eoDisplayGroup1, "payment.amount");
        if (_eoTableColumnAssociation3.canSupportValueFormatter()) { _eoTableColumnAssociation3.setValueFormatter(_nsNumberFormatter0); }
        _eoTableColumnAssociation3.establishConnection();
        _tableColumn3.setMinWidth(10);
        _tableColumn3.setMaxWidth(1000);
        _tableColumn3.setPreferredWidth(100);
        _tableColumn3.setWidth(100);
        _tableColumn3.setResizable(true);
        _tableColumn3.setHeaderValue("Payment.amount");
        _eoTableColumnAssociation2.bindAspect(com.webobjects.eointerface.EOAssociation.ValueAspect, _eoDisplayGroup1, "theDate");
        if (_eoTableColumnAssociation2.canSupportValueFormatter()) { _eoTableColumnAssociation2.setValueFormatter(_nsTimestampFormatter0); }
        _eoTableColumnAssociation2.establishConnection();
        _tableColumn2.setMinWidth(10);
        _tableColumn2.setMaxWidth(1000);
        _tableColumn2.setPreferredWidth(100);
        _tableColumn2.setWidth(100);
        _tableColumn2.setResizable(true);
        _tableColumn2.setHeaderValue("The Date");
        _eoTableColumnAssociation1.bindAspect(com.webobjects.eointerface.EOAssociation.ValueAspect, _eoDisplayGroup1, "customer.firstName");
        _eoTableColumnAssociation1.establishConnection();
        _tableColumn1.setMinWidth(10);
        _tableColumn1.setMaxWidth(1000);
        _tableColumn1.setPreferredWidth(100);
        _tableColumn1.setWidth(100);
        _tableColumn1.setResizable(true);
        _tableColumn1.setHeaderValue("Customer.first Name");
        _eoTableColumnAssociation0.bindAspect(com.webobjects.eointerface.EOAssociation.ValueAspect, _eoDisplayGroup1, "customer.lastName");
        _eoTableColumnAssociation0.establishConnection();
        _tableColumn0.setMinWidth(10);
        _tableColumn0.setMaxWidth(1000);
        _tableColumn0.setPreferredWidth(100);
        _tableColumn0.setWidth(100);
        _tableColumn0.setResizable(true);
        _tableColumn0.setHeaderValue("Customer.last Name");
        _nsTableView0.table().addColumn(_tableColumn0);
        _nsTableView0.table().addColumn(_tableColumn1);
        _nsTableView0.table().addColumn(_tableColumn2);
        _nsTableView0.table().addColumn(_tableColumn3);
        _setFontForComponent(_nsTableView0.table().getTableHeader(), "Lucida Grande", 11, Font.PLAIN);
        _eoTableAssociation0.bindAspect(com.webobjects.eointerface.EOAssociation.SourceAspect, _eoDisplayGroup1, "");
        _eoTableAssociation0.setSortsByColumnOrder(true);
        _eoTableAssociation0.establishConnection();

        if (_replacedObjects.objectForKey("_eoDisplayGroup2") == null) {
            _eoDisplayGroup2.setValidatesChangesImmediately(false);
            _eoDisplayGroup2.setFetchesOnLoad(false);
            _eoDisplayGroup2.setUsesOptimisticRefresh(false);
            _eoDisplayGroup2.setSelectsFirstObjectAfterFetch(true);
        }

        _setFontForComponent(_nsButton0, "Lucida Grande", 13, Font.PLAIN);
        _nsButton0.setMargin(new Insets(0, 2, 0, 2));
        _nsButton0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_eoEditingContext0, "saveChanges", _nsButton0), ""));

        if (_replacedObjects.objectForKey("_eoDistributedDataSource0") == null) {
            _connect(_eoDistributedDataSource0, _eoEditingContext0, "editingContext");
        }

        if (_replacedObjects.objectForKey("_eoDisplayGroup1") == null) {
            _connect(_eoDisplayGroup1, _eoDistributedDataSource0, "dataSource");
        }

        if (_replacedObjects.objectForKey("_eoDisplayGroup1") == null) {
            _eoDisplayGroup1.setValidatesChangesImmediately(false);
            _eoDisplayGroup1.setFetchesOnLoad(true);
            _eoDisplayGroup1.setUsesOptimisticRefresh(false);
            _eoDisplayGroup1.setSelectsFirstObjectAfterFetch(true);
        }

        _eoTextAssociation0.bindAspect(com.webobjects.eointerface.EOAssociation.ValueAspect, _eoDisplayGroup1, "@query=.customer.lastName");
        _eoTextAssociation0.setUsesDefaultBackgroundColors(false);
        _eoTextAssociation0.establishConnection();
        _setFontForComponent(_eoFormCell0, "Lucida Grande", 13, Font.PLAIN);
        _eoFormCell0.setTitle("customer.lastName");
        _eoFormCell0.setTitleWidth(167);
        _eoFormCell0.titleComponent().setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        _eoFormCell0.setSize(386, 22);
        _eoFormCell0.setLocation(0, 0);
        _nsForm0.add(_eoFormCell0);
        _eoFormCell1.setSize(386, 22);
        _eoFormCell1.setLocation(0, 25);
        _nsForm0.add(_eoFormCell1);
        _eoFormCell2.setSize(386, 22);
        _eoFormCell2.setLocation(0, 50);
        _nsForm0.add(_eoFormCell2);
        _setFontForComponent(_nsForm0, "Lucida Grande", 13, Font.PLAIN);
        if (!(_nsView0.getLayout() instanceof EOViewLayout)) { _nsView0.setLayout(new EOViewLayout()); }
        _nsForm0.setSize(386, 72);
        _nsForm0.setLocation(13, 68);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsForm0, EOViewLayout.WidthSizable | EOViewLayout.MaxYMargin);
        _nsView0.add(_nsForm0);
        _nsTableView0.setSize(472, 160);
        _nsTableView0.setLocation(13, 148);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTableView0, EOViewLayout.WidthSizable | EOViewLayout.HeightSizable);
        _nsView0.add(_nsTableView0);
        _nsTableView1.setSize(472, 160);
        _nsTableView1.setLocation(13, 336);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTableView1, EOViewLayout.WidthSizable | EOViewLayout.MinYMargin);
        _nsView0.add(_nsTableView1);
        _nsMatrix0.setSize(174, 26);
        _nsMatrix0.setLocation(116, 39);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsMatrix0, EOViewLayout.MaxYMargin);
        _nsView0.add(_nsMatrix0);
        _nsButton1.setSize(82, 25);
        _nsButton1.setLocation(11, 39);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton1, EOViewLayout.MaxYMargin);
        _nsView0.add(_nsButton1);
        _nsButton0.setSize(82, 25);
        _nsButton0.setLocation(405, 39);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton0, EOViewLayout.MinXMargin | EOViewLayout.MaxYMargin);
        _nsView0.add(_nsButton0);
        _nsButton2.setSize(82, 25);
        _nsButton2.setLocation(405, 67);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton2, EOViewLayout.MinXMargin | EOViewLayout.MaxYMargin);
        _nsView0.add(_nsButton2);
        _nsMatrix1.setSize(174, 26);
        _nsMatrix1.setLocation(10, 307);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsMatrix1, EOViewLayout.MinYMargin);
        _nsView0.add(_nsMatrix1);

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _nsView0.setSize(498, 502);
            _eoFrame0.setTitle("Window");
            _eoFrame0.setLocation(326, 236);
            _eoFrame0.setSize(498, 476);
        }
    }
}
