package com.webapp.videocapitol.test;
//package co.com.xoftix.spaweb.programametodologico.controller;
//
//import static co.com.xoftix.cons.ConstantesGenerales.ESPACIO_VACIO;
//import static co.com.xoftix.object.dto.Cons.MSG_ACTUALIZAR_REGISTRO;
//import static co.com.xoftix.object.dto.Cons.MSG_ELIMINAR_REGISTRO;
//import static co.com.xoftix.object.dto.Cons.MSG_SELECCIONE_ITEM;
//import static co.com.xoftix.object.dto.Cons.UNKNOWN_EXCEPTION;
//import static co.com.xoftix.spaweb.programametodologico.cons.ProgramaMetodologicoCons.PARAM_ATRIBUTO_SELECTOR_BIENELEM;
//import static co.com.xoftix.spaweb.programametodologico.cons.ProgramaMetodologicoCons.PARAM_ATRIBUTO_SELECTOR_VICTIMA;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//import org.apache.commons.lang.BooleanUtils;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Column;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Groupbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listheader;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Row;
import org.zkoss.zul.Textbox;

//import co.com.xoftix.exepcion.XoftixException;
//import co.com.xoftix.perfilacion.logica.dto.MenuDTO;
//import co.com.xoftix.persitencia.svc.dfn.IGeneralConectSvc;
//import co.com.xoftix.persitencia.util.ServiceLocator;
//import co.com.xoftix.programametodologico.logica.dto.CasoPorUsuarioDTO;
//import co.com.xoftix.programametodologico.logica.dto.TeoriaCasoBienElementoDTO;
//import co.com.xoftix.programametodologico.logica.dto.TeoriaCasoDTO;
//import co.com.xoftix.programametodologico.logica.dto.TeoriaCasoVictimaDTO;
//import co.com.xoftix.programametodologico.logica.dto.TeoriaPorCasoDTO;
//import co.com.xoftix.web.controller.GeneralController;
//import co.com.xoftix.web.controller.ListSelector;
//import co.com.xoftix.web.session.common.ValidadorZK;

public class TeoriaCasoController extends SelectorComposer<Component>{

    /**
     * 
     */
    private static final long serialVersionUID = -8370610493469315073L;

    private static final String MSG_ELIMINAR_REGISTRO = "Registro ELIMINADO";

    private static final String MSG_ACTUALIZAR_REGISTRO = "Registro ACTUALIZADO";

    @Wire
    private Groupbox Gb_hipotesisSecundaria;
    @Wire
    private Row C_FormAddTeoriaCaso;
    @Wire
    private Row R_AgregarPrincipal;
    @Wire
    private Row R_AgregarSecundaria;
    @Wire
    private Listbox Lb_TeoriaCaso;
    @Wire
    private Label L_MensajeHipotesis;

    @Wire
    private Textbox TB_RelatoHipotesis;
    @Wire
    private Textbox TB_ResumenHipotesis;
    @Wire
    private Textbox TB_TextoHipotesis;
    @Wire
    private Textbox TB_ObjetivoHipotesis;

    @Wire
    private Textbox TB_Teoria;
    @Wire
    private Textbox TB_Resumen;
    @Wire
    private Button B_EnviarTeoriaCaso;
    @Wire
    private Button B_EditarTeoriaCaso;

    @Wire
    private Combobox Se_IdPersonaVictima;
    @Wire
    private Combobox Se_IdBienElemento;
    @Wire
    private Listheader Lh_EditarTeoriaCaso;
    @Wire
    private Listheader Lh_EliminarTeoriaCaso;

//    private IGeneralConectSvc generalConectSvc = ServiceLocator.getService(IGeneralConectSvc.class);
//    private CasoPorUsuarioDTO casoPorUsuarioSelectDTO;
//
    private TeoriaCaso teoriaPorCasoDTO;
    private String teoriaCasoVictimaDTO;
    private String teoriaCasoBienElementoDTO;
    private List<TeoriaCaso> listTeoriaPorCasoSelectDTO;
    private List<String> personas;
    private List<String> bienes;
    
    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        this.catchTeoriaCaso(null);
    }

    public boolean validarCampos() /*throws XoftixException*/ {
//        try {
//            boolean validador = true;
//            validador &= ValidadorZK.validarListSelector(this.mapa, this.Se_IdPersonaVictima, false);
//            validador &= ValidadorZK.validarListSelector(this.mapa, this.Se_IdBienElemento, false);
//            validador &= ValidadorZK.validarTextbox(this.mapa, this.TB_Teoria, true, 1000);
//            validador &= ValidadorZK.validarTextbox(this.mapa, this.TB_Resumen, true, 1000);
//            return validador;
//        } catch (Exception e) {
//            throw new XoftixException(e, UNKNOWN_EXCEPTION);
//        }
        return true;
    }

    @SuppressWarnings("unchecked")
//    @Listen("onCargarDatos=#Win_TeoriaCaso")
    public void catchTeoriaCaso(Event event) {
        teoriaPorCasoDTO = new TeoriaCaso();
        teoriaCasoVictimaDTO = new String();
        teoriaCasoBienElementoDTO = new String();
        listTeoriaPorCasoSelectDTO = new ArrayList<TeoriaCaso>();
        this.personas = Data.getPersonas();
        this.bienes = Data.getBienes();
//        casoPorUsuarioSelectDTO = new CasoPorUsuarioDTO();
//        this.casoPorUsuarioSelectDTO = (CasoPorUsuarioDTO) ((HashMap<String, Object>) event.getData()).get("casoPorUsuarioSelectDTO");
        this.cargarComponentesTeoriaCaso();
    }

    @Listen("onCargarPermisos=#Win_TeoriaCaso")
    public void onCargarPermisos(Event event) {
//        MenuDTO menuDTO = (MenuDTO) event.getData();
//        this.R_AgregarPrincipal.setVisible(BooleanUtils.toBoolean(menuDTO.getPuedeCrear().intValue()));
//        this.B_EditarTeoriaCaso.setVisible(BooleanUtils.toBoolean(menuDTO.getPuedeEditar().intValue()));

    }

    public void cargarComponentesTeoriaCaso() {
        
//        try {
//            this.teoriaPorCasoDTO.setIdCaso(this.casoPorUsuarioSelectDTO.getIdCaso());
            this.listTeoriaPorCasoSelectDTO = Data.getTeorias();
            this.Lb_TeoriaCaso.setModel(new ListModelList<TeoriaCaso>(this.listTeoriaPorCasoSelectDTO));
            this.teoriaCasoVictimaDTO = "victima";
            this.teoriaCasoBienElementoDTO = "elemento";
//            this.Se_IdPersonaVictima.setAtributo(PARAM_ATRIBUTO_SELECTOR_VICTIMA);
//            this.Se_IdPersonaVictima.setLabel(mapa.get(MSG_SELECCIONE_ITEM));
            this.Se_IdPersonaVictima.setModel(new ListModelList<String>(this.getPersonas()));
//            this.Se_IdBienElemento.setAtributo(PARAM_ATRIBUTO_SELECTOR_BIENELEM);
//            this.Se_IdBienElemento.setLabel(mapa.get(MSG_SELECCIONE_ITEM));
            this.Se_IdBienElemento.setModel(new ListModelList<String>(this.getBienes()));
//        } catch (XoftixException e) {
//            this.getExcepcion(e);
//        }
    }

    @Listen("onAddPrincipal=#B_AddTeoria")
    public void openTeoriaDialog() {
        this.C_FormAddTeoriaCaso.setVisible(true);
        this.R_AgregarPrincipal.setVisible(false);
        this.B_EnviarTeoriaCaso.setVisible(true);
        this.B_EditarTeoriaCaso.setVisible(false);
    }

    @Listen("onCloseTeoria=#B_CerrarTeoria")
    public void cerrarFormularioTeoriaCaso() {
        this.C_FormAddTeoriaCaso.setVisible(false);
        this.R_AgregarPrincipal.setVisible(true);
        this.limpiarFormularioTeoriaCaso();
        this.cargarComponentesTeoriaCaso();
    }

    @Listen("onEnviarTeoriaCaso=#B_EnviarTeoriaCaso")
    public void enviarTeoriaCaso() {
//        try {
//            if (!validarCampos()) {
//                return;
//            }
            TeoriaCaso teoriaCasoDTO = new TeoriaCaso();
//            teoriaCasoDTO.setIdCaso(this.casoPorUsuarioSelectDTO.getIdCaso());
            teoriaCasoDTO.setNombrePersonaCaso(this.getPersonas().get(this.Se_IdPersonaVictima.getSelectedIndex()));
            teoriaCasoDTO.setDescBienElemento(this.getBienes().get(this.Se_IdBienElemento.getSelectedIndex()));
            teoriaCasoDTO.setTeoria(this.TB_Teoria.getValue());
            teoriaCasoDTO.setResumen(this.TB_Resumen.getValue());
            Data.addTeoriaCaso(teoriaCasoDTO);
            this.getMessage(MSG_ACTUALIZAR_REGISTRO);
            this.cerrarFormularioTeoriaCaso();
            this.cargarComponentesTeoriaCaso();
//        } catch (XoftixException e) {
//            this.getExcepcion(e);
//        }
    }

    @Listen("onOpenEditTeoriaCaso=#Lb_TeoriaCaso")
    public void openEditTeoriaCasoDialog() {
        TeoriaCaso teoriaPorCasoSelectedDTO = this.getListTeoriaPorCasoSelectDTO().get(this.Lb_TeoriaCaso.getSelectedIndex());
        this.TB_Teoria.setRawValue(teoriaPorCasoSelectedDTO.getTeoria());
        this.TB_Resumen.setRawValue(teoriaPorCasoSelectedDTO.getResumen());
        this.Se_IdPersonaVictima.setSelectedIndex(this.getPersonas().indexOf(teoriaPorCasoSelectedDTO.getNombrePersonaCaso()));
        this.Se_IdBienElemento.setSelectedIndex(this.getBienes().indexOf(teoriaPorCasoSelectedDTO.getDescBienElemento()));
        this.C_FormAddTeoriaCaso.setVisible(true);
        this.R_AgregarPrincipal.setVisible(false);
        this.B_EnviarTeoriaCaso.setVisible(false);
        this.B_EditarTeoriaCaso.setVisible(true);
    }

    @Listen("onEditarTeoriaCaso=#B_EditarTeoriaCaso")
    public void editTeoriaCaso() {
//        try {
//
//            if (this.Lb_TeoriaCaso.getSelectedItem() != null && this.Lb_TeoriaCaso.getSelectedItem().getValue() != null) { // BUG_FIX 0004387: En navegadores InternetExplorer
//                if (!validarCampos()) {
//                    return;
//                }
//                TeoriaCaso teoriaPorCasoSelectedDTO = this.getListTeoriaPorCasoSelectDTO().get(this.Lb_TeoriaCaso.getSelectedIndex());
                TeoriaCaso teoriaCasoDTO = this.getListTeoriaPorCasoSelectDTO().get(this.Lb_TeoriaCaso.getSelectedIndex());
//                teoriaCasoDTO.setId(teoriaPorCasoSelectedDTO.getIdTeoriaCaso());
//                teoriaCasoDTO.setIdCaso(this.casoPorUsuarioSelectDTO.getIdCaso());
                teoriaCasoDTO.setDescBienElemento(this.getBienes().get(this.Se_IdBienElemento.getSelectedIndex()));
                teoriaCasoDTO.setNombrePersonaCaso(this.getPersonas().get(this.Se_IdPersonaVictima.getSelectedIndex()));
                teoriaCasoDTO.setTeoria(this.TB_Teoria.getValue());
                teoriaCasoDTO.setResumen(this.TB_Resumen.getValue());
                Data.updateTeoriaCaso(teoriaCasoDTO);
                this.getMessage(MSG_ACTUALIZAR_REGISTRO);
                this.cerrarFormularioTeoriaCaso();
                this.cargarComponentesTeoriaCaso();
//            }
//        } catch (XoftixException e) {
//            this.getExcepcion(e);
//        }
    }

    @Listen("onEliminarTeoriaCaso=#Lb_TeoriaCaso")
    public void deleteTeoriaCaso() {
//        try {
//            TeoriaPorCasoDTO teoriaPorCasoDTO = new TeoriaPorCasoDTO();
//            TeoriaCasoDTO teoriaCasoDTO = new TeoriaCasoDTO();
            TeoriaCaso teoriaPorCasoSelectedDTO = this.getListTeoriaPorCasoSelectDTO().get(this.Lb_TeoriaCaso.getSelectedIndex());
//            teoriaCasoDTO.setId(teoriaPorCasoDTO.getIdTeoriaCaso());
            Data.deleteTeoriaCaso(teoriaPorCasoSelectedDTO);
            this.getMessage(MSG_ELIMINAR_REGISTRO);
            this.cerrarFormularioTeoriaCaso();
            this.cargarComponentesTeoriaCaso();
//        } catch (XoftixException e) {
//            this.getExcepcion(e);
//        }
    }

    private void getMessage(String msgEliminarRegistro) {
        Messagebox.show(msgEliminarRegistro);
        
    }

    public void limpiarFormularioTeoriaCaso() {
        this.Se_IdBienElemento.setSelectedIndex(-1);
        this.Se_IdPersonaVictima.setSelectedIndex(-1);
        this.TB_Teoria.setRawValue("");
        this.TB_Resumen.setRawValue("");
    }

    public TeoriaCaso getTeoriaPorCasoDTO() {
        return teoriaPorCasoDTO;
    }

    public void setTeoriaPorCasoDTO(TeoriaCaso teoriaPorCasoDTO) {
        this.teoriaPorCasoDTO = teoriaPorCasoDTO;
    }

    public String getTeoriaCasoVictimaDTO() {
        return teoriaCasoVictimaDTO;
    }

    public void setTeoriaCasoVictimaDTO(String teoriaCasoVictimaDTO) {
        this.teoriaCasoVictimaDTO = teoriaCasoVictimaDTO;
    }

    public String getTeoriaCasoBienElementoDTO() {
        return teoriaCasoBienElementoDTO;
    }

    public void setTeoriaCasoBienElementoDTO(String teoriaCasoBienElementoDTO) {
        this.teoriaCasoBienElementoDTO = teoriaCasoBienElementoDTO;
    }

    public List<TeoriaCaso> getListTeoriaPorCasoSelectDTO() {
        return listTeoriaPorCasoSelectDTO;
    }

    public void setListTeoriaPorCasoSelectDTO(List<TeoriaCaso> listTeoriaPorCasoSelectDTO) {
        this.listTeoriaPorCasoSelectDTO = listTeoriaPorCasoSelectDTO;
    }

    public List<String> getPersonas() {
        return personas;
    }

    public void setPersonas(List<String> personas) {
        this.personas = personas;
    }

    public List<String> getBienes() {
        return bienes;
    }

    public void setBienes(List<String> bienes) {
        this.bienes = bienes;
    }
}


